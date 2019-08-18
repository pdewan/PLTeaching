//******************************************************************
// * Program or Assignment #: Assignment1
// *
// * Programmer: Jacob
// *
// * Due Date: Tuesday, Jan. 28
// *
// * COMP110-002, Spring 2014       Instructor: Prof. Jay Aikat
// *
// * Pledge: I have neither given nor received unauthorized aid
// *         on this program. 
// *
// * Description: Insert a brief paragraph describing the program
// *
// * Input: Insert a brief description of user inputs, or "None" if
// *        there is no user input
// *
// * Output: Insert a brief description of the program output
// *
// ******************************************************************/
#include <stdio.h>

int io_main()
{
  		int num1;
		double num2;
		setvbuf(stdout, NULL, _IONBF, 0);
		printf("Please input an integer\n");
		// input error handing not needed in equivalent Java program
		if (scanf("%d", &num1) != 1) {
		  fprintf(stderr, "Premature end of file before int was input, exiting");
		  exit(-1);
		}
		printf("Please input a decimal\n");
		// input error handing not needed in equivalent Java program
		if (scanf ("%lf", &num2) != 1) {
		 fprintf(stderr, "Premature end of file before decimal was input, exiting");
		 exit(-1);
		}

		printf("The int addition:%d\n", (num1 + (int) num2));
		printf("The double addition:%f\n", ( (double) num1 + num2));
		printf("The int multiplication:%d\n", (num1 * (int) num2));
		printf("The double multiplication:%f\n", ( (double) num1 * num2));
    
    return 0;
} 
