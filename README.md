# OAuth2-ARyS

Proceso de autorización entre cliente y servidor:

El proceso de autorización entre cliente y servidor en OAuth 2.0 implica que la aplicación cliente solicite acceso a recursos protegidos al servidor de autorización (GitHub). El usuario auténtica la solicitud y otorga permisos a la aplicación. Luego, el servidor de autorización emite un código de autorización que la aplicación intercambia por un token de acceso. Con este token, la aplicación puede acceder a los recursos protegidos en el servidor de recursos (GitHub), que valida el token y proporciona los datos solicitados. Finalmente, la aplicación autentica al usuario y gestiona su sesión mediante un identificador de sesión.
