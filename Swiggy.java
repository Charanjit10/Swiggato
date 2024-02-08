import java.util.Scanner;
class Restaurant
{
Scanner sc = new Scanner(System.in);
static int menu()
{
System.out.println("            _______________________________");
System.out.println("            |Welcome to the our Restaurant|");
System.out.println(" ----------------------------------------------------");
System.out.println(" |     Our Exciting Menu with affordable prices     |");
System.out.println(" ----------------------------------------------------");
System.out.println(" |   Option           Items               Price     |");
System.out.println(" ----------------------------------------------------");
System.out.println(" |    [A]            Biryani               100/-    |");
System.out.println(" |    [B]            Noodles                80/-    |");
System.out.println(" |    [C]           Ice cream               50/-    |");
System.out.println(" |    [D]          Cool Drinks              30/-    |");
System.out.println(" ----------------------------------------------------");
System.out.println(" | Enter the Option in the left to Order that Item  |");
System.out.println(" ----------------------------------------------------");
return 0;
}
}

class Swiggy extends Restaurant
{
void m1()
{
menu();
Float Bill =0.0f;
String checkout = "";
while(true)
{
char select =sc.next().charAt(0);
switch(select)
{
case 'A': {System.out.println("Hey! You Chose 'Biryani'.\nHow many Biryani plates do you want?" ); break;}
case 'B': {System.out.println("Hey! You Chose 'Noodles'.\nHow many Noodle plates do you want?" ); break;}
case 'C': {System.out.println("Hey! You Chose 'Icecream'.\n How many Icecreams do you want?" ); break;}
case 'D': {System.out.println("Hey! You Chose 'CoolDrinks'.\n How many CoolDrinks do you want?" ); break;}
default: {System.out.println("You selected an item which is not in the menu."); break;}
}
if(select == 'A'||select == 'B'||select == 'C'||select == 'D')
{
int Quantity =sc.nextInt();
if(select =='A') {  Bill =  Bill+100*Quantity;}
if(select =='B') {  Bill =  Bill+80*Quantity;}
if(select =='C') {  Bill =  Bill+50*Quantity;}
if(select =='D') {  Bill =  Bill+30*Quantity;}
}
System.out.println("Enter done/Done to checkout esle enter any string to continue adding items.");
checkout = sc.next();
if(checkout.equalsIgnoreCase("done")) {break;}
}

float CGST = 0.09f*Bill;
float SGST = 0.09f*Bill;
float DPfee = 30.0f;
System.out.println("                    -------------------                  ");
System.out.println("                    |Here is your Bill|                  ");
System.out.println(" ----------------------------------------------------------");
System.out.println(" |     Type                                      Price    |");
System.out.println(" | -------------                            ------------- |");
System.out.printf(" | Food Items               -                    %.2f   |\n",Bill);
System.out.printf(" | SGST(9 percent)          -                     %.2f   |\n",CGST);
System.out.printf(" | CGST(9 percent)          -                     %.2f   |\n",SGST);
System.out.println(" | Swiggy DP fee            -                     30.00   |");
System.out.println(" |---------------------------------------------------------");
System.out.printf(" | Total Amount to be Paid to Swiggy is   :  INR %.2f   |\n",(Bill+CGST+SGST+DPfee));
System.out.println(" ----------------------------------------------------------");
}
}

class Zomato extends Restaurant
{
void m1()
{
menu();
Float Bill =0.0f;
String checkout = "";
while(true)
{
char select =sc.next().charAt(0);
switch(select)
{
case 'A': {System.out.println("Hey! You Chose 'Biryani'.\nHow many Biryani plates do you want?" ); break;}
case 'B': {System.out.println("Hey! You Chose 'Noodles'.\nHow many Noodle plates do you want?" ); break;}
case 'C': {System.out.println("Hey! You Chose 'Icecream'.\nHow many Icecreams do you want?" ); break;}
case 'D': {System.out.println("Hey! You Chose 'CoolDrinks'.\nHow many CoolDrinks do you want?" ); break;}
default: {System.out.println("You selected an item which is not in the menu."); break;}
}
if(select == 'A'||select == 'B'||select == 'C'||select == 'D')
{
int Quantity =sc.nextInt();
if(select =='A') {  Bill =  Bill+100*Quantity;}
if(select =='B') {  Bill =  Bill+80*Quantity;}
if(select =='C') {  Bill =  Bill+50*Quantity;}
if(select =='D') {  Bill =  Bill+30*Quantity;}
}
System.out.println("Enter done/Done to checkout esle enter any string to continue adding items.");
checkout = sc.next();
if(checkout.equalsIgnoreCase("done")) {break;}
}

float CGST = 0.09f*Bill;
float SGST = 0.09f*Bill;
float DPfee = 45.0f;
System.out.println("                    -------------------                  ");
System.out.println("                    |Here is your Bill|                  ");
System.out.println(" ----------------------------------------------------------");
System.out.println(" |     Type                                      Price    |");
System.out.println(" | -------------                            ------------- |");
System.out.printf(" | Food Items               -                    %.2f   |\n",Bill);
System.out.printf(" | SGST(9 percent)          -                     %.2f   |\n",CGST);
System.out.printf(" | CGST(9 percent)          -                     %.2f   |\n",SGST);
System.out.println(" | Zomato DP fee            -                     45.00   |");
System.out.println(" |---------------------------------------------------------");
System.out.printf(" | Total Amount to be Paid to Zomato is   :  INR %.2f   |\n",(Bill+CGST+SGST+DPfee));
System.out.println(" ----------------------------------------------------------");
}
}

class User
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("-----------------------------------------------------------------------------------");
System.out.println("Choose from below options to order:\n1. Swiggy\n2. Zomato");
int uc = sc.nextInt();
if(uc==1)
{
System.out.println("You are Ordering via Swiggy");
new Swiggy().m1();
}
else if(uc==2)
{
System.out.println("You are Ordering via Zomato");
new Zomato().m1();
}
else{System.out.println("The Option you entered is Invalid. Please select from Options 1 , 2.");}
}
}
}