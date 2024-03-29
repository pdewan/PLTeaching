#include <stdio.h>
#include <stdbool.h>
#include <omp.h>
int mono_pass_main() {
	setvbuf(stdout, NULL, _IONBF, 0);
	double ts = 0;//total score
	double fs = 0;//final score
	_Bool pass = false;
    #pragma omp parallel
	{
	printf("thread number %d\n", omp_get_thread_num());
	printf("hello\n");
    }
	for (;;) {
		printf("Please input the total score\n");
		if (scanf("%lf", &ts) != 1) {
				fprintf(stderr, "Premature end of file before int was input, exiting");
				exit(-1);
		}
		if (ts < 0) {
			break;
		}
		printf("Please input the final score\n");
		if (scanf("%lf", &fs) != 1) {
			fprintf(stderr, "Premature end of file before int was input, exiting");
			exit(-1);
		}
		pass = (ts >= 60) ||
			   ((fs >= 80) && (ts >= 40));
		printf("isPass:%s\n", pass ? "true" : "false");
	}
	return 0;
}
