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

import android.Manifest
import android.content.Context
import com.dawnimpulse.permissions.android.handlers.PermissionsHandler

/**
 * @author Saksham
 *
 * @note Last Branch Update - master
 * @note Created on 2018-05-23 by Saksham
 *
 * @note Updates :
 */
object Permissions {


    /**
     * Read calendar available
     */
    fun isReadCalendarAvailable(context: Context): Boolean {
        val p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.READ_CALENDAR)
    }

    /**
     * Ask Read calendar
     */
    fun askReadCalendarPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        val p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.READ_CALENDAR, callback)
    }

    /**
     * Write calendar available
     */
    fun isWriteCalendarAvailable(context: Context): Boolean {
        val p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.WRITE_CALENDAR)
    }

    /**
     * Ask Write calendar
     */
    fun askWriteCalendarPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        val p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.WRITE_CALENDAR, callback)
    }

    /**
     * Camera available
     */
    fun isCameraAvailable(context: Context): Boolean {
        val p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.CAMERA)
    }

    /**
     * Ask Camera
     */
    fun askCameraPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        val p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.CAMERA, callback)
    }

    /**
     * Read contacts available
     */
    fun isReadContactsAvailable(context: Context): Boolean {
        val p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.READ_CONTACTS)
    }

    /**
     * Ask Read contacts
     */
    fun askReadContactsPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        val p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.READ_CONTACTS, callback)
    }

    /**
     * Write Contacts available
     */
    fun isWriteContactsAvailable(context: Context): Boolean {
        val p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.WRITE_CONTACTS)
    }

    /**
     * Ask Write Contacts
     */
    fun askWriteContactsPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        val p = PermissionsHandler(context)
        return p.askPermission(Manifest.permission.WRITE_CONTACTS, callback)
    }

    /**
     *  Get Accounts available
     */
    fun isGetAccountsAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.GET_ACCOUNTS)
    }

    /**
     *  Ask Accounts permission
     */
    fun askGetAccountsPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.GET_ACCOUNTS, callback)
    }

    /**
     * Access Fine Location available
     */
    fun isAccessFineLocationAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.ACCESS_FINE_LOCATION)
    }

    /**
     * Ask Access Fine Location permission
     */
    fun askAccessFineLocationPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.ACCESS_FINE_LOCATION, callback)
    }

    /**
     * Access Coarse Location available
     */
    fun isAccessCoarseLocationAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.ACCESS_COARSE_LOCATION)
    }

    /**
     * Ask Access Coarse Location permission
     */
    fun askAccessCoarseLocationPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.ACCESS_COARSE_LOCATION, callback)
    }

    /**
     * Record Audio available
     */
    fun isRecordAudioAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.RECORD_AUDIO)
    }

    /**
     * Ask record audio permission
     */
    fun askRecordAudioPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.RECORD_AUDIO, callback)
    }

    /**
     * Read Phone State available
     */
    fun isReadPhoneStateAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.READ_PHONE_STATE)

    }

    /**
     * Ask Read Phone State permission
     */
    fun askReadPhoneStatePermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.READ_PHONE_STATE, callback)
    }

    /**
     * Read Phone Numbers available
     */
    fun isReadPhoneNumbersAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.READ_PHONE_NUMBERS)
    }

    /**
     * Ask Read Phone Numbers permission
     */
    fun askReadPhoneNumbersPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.READ_PHONE_NUMBERS, callback)
    }

    /**
     * Call Phone available
     */
    fun isCallPhoneAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.CALL_PHONE)
    }

    /**
     * Ask Call Phone permission
     */
    fun askCallPhonePermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.CALL_PHONE, callback)
    }

    /**
     * Answer Phone Calls available
     */
    fun isAnswerPhoneCallsAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.ANSWER_PHONE_CALLS)
    }

    /**
     * Ask Answer Phone Calls permission
     */
    fun askAnswerPhoneCallsPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.ANSWER_PHONE_CALLS, callback)
    }

    /**
     * Read call log available
     */
    fun isReadCallLogAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.READ_CALL_LOG)
    }

    /**
     * Ask Read call log permission
     */
    fun askReadCallLogPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.READ_CALL_LOG, callback)
    }

    /**
     * Write call log available
     */
    fun isWriteCallLogAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.WRITE_CALL_LOG)
    }

    /**
     * Ask Write call log permission
     */
    fun askWriteCallLogPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.WRITE_CALL_LOG, callback)
    }

    /**
     * Add VoiceMail available
     */
    fun isAddVoiceMailAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.ADD_VOICEMAIL)
    }

    /**
     * Ask Add VoiceMail permission
     */
    fun isAddVoiceMailAvailable(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.ADD_VOICEMAIL, callback)
    }

    /**
     * Use SIP available
     */
    fun isUseSipAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.USE_SIP)
    }

    /**
     * Ask Use SIP permission
     */
    fun askUseSipPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.USE_SIP, callback)
    }

    /**
     * Process Outgoing Calls available
     */
    fun isProcessOutgoingCallsAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.PROCESS_OUTGOING_CALLS)
    }

    /**
     * Ask Process Outgoing Calls permission
     */
    fun askProcessOutgoingCallsPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.PROCESS_OUTGOING_CALLS, callback)
    }

    /**
     * Body Sensors available
     */
    fun isBodySensorsAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.BODY_SENSORS)
    }

    /**
     * Ask Body Sensors permission
     */
    fun askBodySensorsPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        return p.askPermission(Manifest.permission.BODY_SENSORS, callback)
    }

    /**
     * Send SMS available
     */
    fun isSendSmsAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.SEND_SMS)
    }

    /**
     * Ask Send SMS permission
     */
    fun askSendSmsPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.SEND_SMS, callback)
    }

    /**
     * Read SMS available
     */
    fun isReadSmsAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.READ_SMS)
    }

    /**
     * Ask Read SMS permission
     */
    fun askReadSmsPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.READ_SMS, callback)
    }

    /**
     * Receive SMS available
     */
    fun isReceiveSmsAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.RECEIVE_SMS)
    }

    /**
     * Ask Receive SMS permission
     */
    fun askReceiveSmsPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.RECEIVE_SMS, callback)
    }

    /**
     * Receive WAP Push available
     */
    fun isReceiveWapPushAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.RECEIVE_WAP_PUSH)
    }

    /**
     * Ask Receive WAP Push permission
     */
    fun askReceiveWapPushPermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.RECEIVE_WAP_PUSH, callback)
    }

    /**
     * Receive MMS available
     */
    fun isReceiveMmsAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.RECEIVE_MMS)
    }

    /**
     * Ask Receive MMS permission
     */
    fun isReceiveMmsAvailable(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.RECEIVE_MMS, callback)
    }

    /**
     * Read External Storage available
     */
    fun isReadExternalStorageAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.READ_EXTERNAL_STORAGE)
    }

    /**
     * Ask Read External Storage permission
     */
    fun askReadExternalStoragePermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.READ_EXTERNAL_STORAGE, callback)
    }

    /**
     * Write External Storage available
     */
    fun isWriteExternalStorageAvailable(context: Context): Boolean {
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(Manifest.permission.WRITE_EXTERNAL_STORAGE)
    }

    /**
     * Ask Write External Storage permission
     */
    fun askWriteExternalStoragePermission(context: Context, callback: (Any?, Any?) -> Unit) {
        var p = PermissionsHandler(context)
        p.askPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE,callback)
    }

    /**
     * any other permission available
     * @param permission
     */
    fun isPermissionAvailable(permission:String,context: Context):Boolean{
        var p = PermissionsHandler(context)
        return p.isPermissionAvailable(permission)
    }

    /**
     * ask any other permission
     * @param permission
     */
    fun askPermission(permission:String,context: Context,callback: (Any?, Any?) -> Unit){
        var p = PermissionsHandler(context)
        p.askPermission(permission,callback)
    }
}