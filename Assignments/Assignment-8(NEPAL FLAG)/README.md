## Assigned Date: jan 15/ 2021 Deadline : jan 17/ 2022
## Submitted in: Jan 17/ 2022 

## Java AWT | Color Class
The Color class is a part of Java Abstract Window Toolkit(AWT) package. The Color class creates color by using the given RGBA values where RGBA stands for RED, GREEN, BLUE, ALPHA or using HSB value where HSB stands for HUE, SATURATION, BRIcomponents. The value for individual components RGBA ranges from 0 to 255 or 0.0 to 0.1. The value of alpha determines the opacity of the color, where 0 or 0.0 stands fully transparent and 255 or 1.0 stands opaque.

## Constructors of Color Class

- Color(ColorSpace c, float[] co, float a) : Creates a color in the specified ColorSpace with the color components specified in the float array and the specified alpha.
- Color(float r, float g, float b) : creates a opaque color with specified RGB components(values are in range 0.0 – 0.1)
- Color(float r, float g, float b, float a) : creates a color with specified RGBA components(values are in range 0.0 – 0.1)
- Color(int rgb): Creates an opaque RGB color with the specified combined RGB value consisting of the red component in bits 16-23, the green component in bits 8 – 15, and the blue component in bits 0-7.
- Color(int rgba, boolean b): Creates an sRGB color with the specified combined RGBA value consisting of the alpha component in bits 24-31, the red component in bits 16 – 23, the green component in bits 8 – 15, and the blue component in bits 0 – 7.
- Color(int r, int g, int b) : Creates a opaque color with specified RGB components(values are in range 0 – 255)
- Color(int r, int g, int b, int a) : Creates a color with specified RGBA components(values are in range 0 – 255)
 