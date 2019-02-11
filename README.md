# Permissions Android
> With only a single line of code, Permissions is the easiest  wrapper library for handling android permissions by providing methods for all kinds of permissions in android with a straightforward callback.

- Single line function call is all you need to ask / check for permission and handle the response accordingly. 

- No more working through tons of lines of code and using different methods to ask & handle a simple permission.

- Even asking multiple permissions in a single time is also 1 line of code.
- **The library is written in kotlin using lambda functions so it may/may not be used with java.**

#### Implementation

~~~
	implementation 'org.sourcei.android:permissions:1.0.0'
~~~

#### Usage

- Eg for storage permission
~~~
Permissions.askWriteExternalStoragePermission(context, { no, yes->  
 // no will be null in case of permission provided/available & vise-versa
})
~~~
> Note: If you don't find a particular permission's method just simply call **askPermission** method providing 3 parameters - permission, context, callback.

- Eg for asking multiple permissions
```
// create a simple list of string
var list = listOf(  
			  Manifest.permission.WRITE_CALENDAR,  
			  Manifest.permission.WRITE_CONTACTS,  
			  Manifest.permission.CAMERA,  
			  Manifest.permission.WRITE_EXTERNAL_STORAGE  
		   )
		   
Permissions.askMultiplePermissions(list, this){ result ->
  // the result will be a list of Boolean in same order as original one
  // eg. [true,false,true,true]
  // handle it the way you wish too :)
}
```
#### Releases
- v1.0.1
	- New : Switched to my open sourced domain (sourcei.org)
	- New : Asking multiple permissions as a list
- v0.9.1
	- Bug Fix : crash if permission is denied due to not checking empty grantResults array
- v0.9.0
	- Bug Fix  :  On back press handling
- v0.1.1
	- Simple permission handling

> Pull requests are always welcomed (kindly sign commits with GPG keys. **THANKS**)
#### Contact
-   Twitter -  [@dawnimpulse](https://twitter.com/dawnimpulse)

#### License
~~~~
ISC Licence

Copyright 2018-2019 Saksham (DawnImpulse)

Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted,
provided that the above copyright notice and this permission notice appear in all copies.

THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE
OR PERFORMANCE OF THIS SOFTWARE.
~~~~