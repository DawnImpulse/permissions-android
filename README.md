# Permissions Android
> Permissions is a wrapper library for handling android permissions by providing easy to use methods for all kinds of permissions in android with straightforward callbacks.

- Single line function call is all you need to ask / check for permission and handle the response accordingly. 

- No more working through tons of lines of code and using different methods to ask & handle a simple permission.

#### Current Features (v0.1.1)
- Asking / checking various permissions functions.
- Default permission flow as in Android.
- **The library is written in kotlin using lambda functions so it may/may not be used with java.**

#### Implementation

~~~
	implementation 'com.dawnimpulse:permissions:0.1.1'
~~~

#### Usage

- Eg for storage permission
~~~
Permissions.askWriteExternalStoragePermission(context, { no, yes->  
 // no will be null in case of permission provided/available & vise-versa
})
~~~
> Note: If you don't find a particular permission's method just simply call askPermission providing 3 parameters - permission, context, callback.
#### Releases
- v0.1.1
	- Simple permission handling

#### Upcoming
- v1.0.0
	- Stable release focusing on complete permission denied, custom information dialog/view before asking for permission etc.

> Pull requests are always welcomed (kindly sign commits with GPG keys. **THANKS**)
#### Contact
-   Twitter -  [@dawnimpulse](https://twitter.com/dawnimpulse)

#### License
~~~~
ISC Licence

Copyright 2018 Saksham (DawnImpulse)

Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted,
provided that the above copyright notice and this permission notice appear in all copies.

THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE
OR PERFORMANCE OF THIS SOFTWARE.
~~~~