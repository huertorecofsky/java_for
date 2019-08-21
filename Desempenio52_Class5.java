import hsa.Console;
class Desempenio52_Class5
{
static Console c;
public static void main (String arg[])
{
int i, b, h, s, mayor, n, suma;
c = new Console ();
b = h = mayor = 0;
c.print("Ingrese la cantiad de pares de datos a utilizar: ") ;
n = c.readInt();
for (i=1;i<=n;i++)
{
c.print("Ingrese la base del triangulo: ");
b = c.readInt();
c.print("Ingrese la altura del triangulo: ");
h = c.readInt();
s = b * h;
c.println("La base del triangulo es: " + b);
c.println("La altura del triangulo es: " + h);
c.println("La superficie del triangulo es: " + s);
if (s > 12)
mayor++;
}
c.println ("La cantidad de triangulos cuya superfie es mayor a 12 es: " + mayor);
suma = c.readInt();
}
}

