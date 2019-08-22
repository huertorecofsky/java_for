import hsa.Console;
class Desempenio53_Clase5
{
static Console c;
public static void main (String arg[])
{
int i, suma, n;
c = new Console();
suma = 0;
for (i=1; i<=15; i++)
{
c.print("Ingrese un numero: ");
n = c.readInt();
if (i>5)
suma = suma + n;
}
c.print ("Suma de los 10 ultimos numeros ingresados: " + suma);
}
}
