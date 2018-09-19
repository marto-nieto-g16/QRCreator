<img src="https://raw.githubusercontent.com/marto-nieto-g16/QRCreator/master/QRCreator.png" />

# QRCreator
Esta aplicación permitirá codificar un texto introducido por teclado por el usuario,
especificar las dimensiones del mismo, generar el código QR y tener la posibilidad de 
guardarlo en disco en formato de imagen.

# ¿Que es un Código QR?

“Un código QR (quick response code, «código de respuesta rápida»)
es un módulo útil para almacenar información en una matriz de puntos
o un código de barras bidimensional creado en 1994 por la compañía japonesa Denso Wave, subsidiaria de Toyota.

# Requisitos
1. Librerías ZXing (core-2.3.0.jar y zxing-j2se-1.7.jar)
2. Java
3. IDE Netbeans 7 o superior

<img src="http://www.jc-mouse.net/wp-content/uploads/2015/02/qrcreator_project.gif" />

1. Interfaz.java: es un JFrame, la interfaz principal de nuestra aplicación
2. MyQRCreator.java: Clase donde se implementara los métodos de la libreria ZXing
3. QRDialog.java: es una clase de tipo JDialog

# Interfaz.java
  
es un JFrame, la interfaz principal

# JDialog (QRDialog):

La interfaz del JDialog, solamente consiste solamente en un JLabel, ayúdate de un GridBagLayout para centrarlo en la ventana. Este JDialog nos permitirá mostrar el QR.

# MyQRCreator.java

Esta clase contiene un método para crear codificar un texto y retornar una imagen en memoria.
