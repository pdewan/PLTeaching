#include <stdio.h>
#include <stdbool.h>
#include <omp.h>
int mono_main_omp() {
	setvbuf(stdout, NULL, _IONBF, 0);

//	 struct Point {
//	    int x;
//	    int y;
//	};
//
//	struct Point p1 = {0, 0};
//	struct Point p2 = p1;
//	printf("%d %d\n", p1.x, p2.x);
//			p1.x = 29;
//	printf("%d %d\n", p1.x, p2.x);


	double totalScore = 0;
	double finalScore = 0;
	_Bool pass = false;
    #pragma omp parallel
	{
	printf("thread number %d\n", omp_get_thread_num());
	printf("hello\n");
    }
	for (;;) {
		printf("Please input the total score\n");
		if (scanf("%lf", &totalScore) != 1) {
				fprintf(stderr, "Premature end of file before int was input, exiting");
//				exit(-1);
		}
		if (totalScore < 0) {
			break;
		}
		printf("Please input the final score\n");
		if (scanf("%lf", &finalScore) != 1) {
			fprintf(stderr, "Premature end of file before int was input, exiting");
//			exit(-1);
		}
		pass = (totalScore >= 60) ||
			   ((finalScore >= 80) && (totalScore >= 40));
		printf("isPass:%s\n", pass ? "true" : "false");
	}
	return 0;
}
//int main() {
//	mono_main();
//}
