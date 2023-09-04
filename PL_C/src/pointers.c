#include <stdio.h>
#include <stdbool.h>
#include <omp.h>
int pointers_main() {
	setvbuf(stdout, NULL, _IONBF, 0);
	struct Point3D {
		    float x;
		    float y;
		    float z;
		};
	struct Point {
	    int x;
	    int y;
	};
	((struct Point *)malloc(sizeof(struct Point)))->y = 5;
	struct Point p1 = {10, 20};
	struct Point p2 = p1;
	struct Point* p3 = &p1;
	struct Point* p4 = (struct Point *)malloc(sizeof(struct Point));
	p4->x = 5;
	printf("%d\n", p4->x);
	printf("%d %d %d\n", p1.x, p2.x, (*p3).x);
	p1.x = 30;
	printf("%d %d %d\n", p1.x, p2.x, (*p3).x);
	(*p3).x = 40;
	printf("%d %d %d\n", p1.x, p2.x, (*p3).x);
	(*&p1).x = 50;
	printf("%d %d %d\n", p1.x, p2.x, (*p3).x);
	printf("%d\n",*(&(p1.x) + 1));
	float retVal;
//	scanf("%lf", &retVal);
//	scanf("%lf", 10 + 2);
//	char *aCharPointer = "hello";
//	char aChar = 'A';
	char * aCharPointer = "ABCD";
//	char *aCharPointer= &aChar;
	printf("Int value: %d\n",
			 (int) (*aCharPointer));

	printf("Element: %c\n",
	  aCharPointer[3]);



	return 0;
}
int main() {
	pointers_main();
}
