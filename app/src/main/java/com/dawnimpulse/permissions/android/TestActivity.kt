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
package com.dawnimpulse.permissions.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.dawnimpulse.permissions.library.R

/**
 * @author Saksham
 *
 * @note Last Branch Update - master
 * @note Created on 2018-05-23 by Saksham
 *
 * @note Updates :
 */
class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        Permissions.askWriteExternalStoragePermission(this,{no,yes->
            Log.d("Permissions","$no :: $yes")
        })
    }
}
