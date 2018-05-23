/*
ISC License
Copyright 2018, Saksham (DawnImpulse)
Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted,
provided that the above copyright notice and this permission notice appear in all copies.
THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE
OR PERFORMANCE OF THIS SOFTWARE.
*/
package com.dawnimpulse.permissions.android.handlers

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.content.PermissionChecker.checkSelfPermission
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.dawnimpulse.permissions.android.utils.C
import com.dawnimpulse.permissions.android.utils.Config


/**
 * @author Saksham
 *
 * @note Last Branch Update - master
 * @note Created on 2018-05-23 by Saksham
 *
 * @note Updates :
 */
class PermissionsHandler {
    lateinit var context: Context

    /**
     * constructor
     */
    constructor(context: Context) {
        this.context = context
    }

    /**
     * if a particular permission is available
     * @param permission
     */
    fun isPermissionAvailable(permission: String): Boolean {
        return if (isPermissionProvidedInManifest(permission)) {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M)
                true
            else
                checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED
        } else
            false
    }

    /**
     * ask for a permission
     * @param permission
     * @param callback
     */
    fun askPermission(permission: String, callback: (Any?, Any?) -> Unit) {
        if (isPermissionProvidedInManifest(permission)) {
            if (isPermissionAvailable(permission))
                callback(null, true)
            else {
                var intent = Intent(context, Inner::class.java)
                intent.putExtra(C.PERMISSION, permission)
                Config.callback = callback
                (context as AppCompatActivity).startActivity(intent)
            }
        } else
            callback(false, null)
    }

    private fun isPermissionProvidedInManifest(permission: String): Boolean {
        val NAME = "Permissions"
        try {
            val packageInfo = context.packageManager.getPackageInfo(context.packageName, PackageManager.GET_PERMISSIONS)
            if (packageInfo != null) {
                val requestedPermissions = packageInfo!!.requestedPermissions

                return if (requestedPermissions == null || requestedPermissions.isEmpty()) {
                    Log.d(NAME, "No permissions provided in Manifest")
                    false
                } else {
                    if (requestedPermissions.contains(permission))
                        true
                    else {
                        Log.d(NAME, "[$permission] not provided in Manifest")
                        false
                    }
                }
            } else {
                Log.d("Permissions", " Package info not available")
                return false
            }
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
            return false
        }
    }

    /**
     * Inner activity to call permissions
     */
    class Inner : AppCompatActivity() {
        private val PERMISSION_REQUEST_CODE = 1

        /**
         * on create
         */
        @RequiresApi(Build.VERSION_CODES.M)
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            Log.d("Test", "HERE")
            val permission = intent.extras.get(C.PERMISSION) as String
            requestPermissions(arrayOf<String>(permission), PERMISSION_REQUEST_CODE)
        }

        /**
         * Permissions result
         */
        override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults)

            if (requestCode == PERMISSION_REQUEST_CODE) {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED)
                    Config.callback(null, true)
                else
                    Config.callback(false, null)
            }
        }
    }
}