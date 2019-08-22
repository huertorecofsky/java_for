import hsa.Console;
class Desempenio54_Clase5
{
static Console c;
public static void main (String arg[])
{
int i, n, m;
c = new Console ();
m=0;
for (i=1; i<=20; i++)
{
c.print ("Ingrese un numero: ");
n = c.readInt();
if (i==1)
{
m = n;
}
if (n > m)
{
m = n;
}
}
c.print ("El mayor de los numeros ingresados es: " + m);
}
}
