#include <stdio.h>
#include <stdbool.h>

double inputDouble(char *aPrompt) {
	double retVal;
	printf(aPrompt);
	if (scanf("%lf", &retVal) != 1) {
		fprintf(stderr, "Premature end of file before int was input, exiting");
		exit(-1);
	}
	return retVal;
}

const double TOTAL_CUT_OFF = 60;
_Bool regularPass(double totalScore) {
	return totalScore >= TOTAL_CUT_OFF;
}

const int HIGH_FINAL_TOTAL_CUTOFF = 40;
const int HIGH_FINAL_CUTOFF = 80;

_Bool highFinalPass(double totalScore, double finalScore) {
	return (finalScore >= HIGH_FINAL_CUTOFF) && (totalScore >= HIGH_FINAL_TOTAL_CUTOFF);
}

_Bool pass(double totalScore, double finalScore) {
	return regularPass(totalScore) || highFinalPass(totalScore, finalScore);
}

void enableOutputFlush() {
	setvbuf(stdout, NULL, _IONBF, 0);
}
int passMain() {

//int passMain() {
	enableOutputFlush();
	for (;;) {
		double totalScore = inputDouble("Please input the total score\n");
		if (totalScore < 0) {
			break;
		}
		double finalScore = inputDouble("Please input the final score\n");

		printf("isPass:%s\n", pass(totalScore, finalScore) ? "true" : "false");
	}

	return 0;
}
