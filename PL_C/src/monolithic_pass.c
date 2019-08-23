#include <stdio.h>
#include <stdbool.h>
int main() {
	setvbuf(stdout, NULL, _IONBF, 0);
	double totalScore = 0;
	double finalScore = 0;
	_Bool pass = false;
	for (;;) {
		printf("Please input the total score\n");
		if (scanf("%lf", &totalScore) != 1) {
				fprintf(stderr, "Premature end of file before int was input, exiting");
				exit(-1);
		}
		if (totalScore < 0) {
			break;
		}
		printf("Please input the final score\n");
		if (scanf("%lf", &finalScore) != 1) {
			fprintf(stderr, "Premature end of file before int was input, exiting");
			exit(-1);
		}
		pass = (totalScore >= 60) ||
			   (finalScore >= 80) && (totalScore >= 40);
		printf("isPass:%s\n", pass ? "true" : "false");
	}
	return 0;
}
