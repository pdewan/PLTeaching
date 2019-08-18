#include <stdio.h>
#include <stdbool.h>

//typedef enum { false, true } bool;
double inputDouble(char *aPrompt) {
	double retVal;
	printf(aPrompt);
	if (scanf("%lf", &retVal) != 1) {
		fprintf(stderr, "Premature end of file before int was input, exiting");
		exit(-1);
	}
	return retVal;
}
void enableOutputFlush() {
	setvbuf(stdout, NULL, _IONBF, 0);
}
const double PASS_CUT_OFF = 60;
_Bool regularPass(double totalScore) {
	return totalScore >= PASS_CUT_OFF;
}

const int HIGH_FINAL_CUTOFF = 40;
const int HIGH_FINAL_THRESHOLD = 80;

_Bool highFinalPass(double totalScore, double finalScore) {
	return (finalScore >= HIGH_FINAL_THRESHOLD) && (totalScore >= HIGH_FINAL_CUTOFF);
}

_Bool pass(double totalScore, double finalScore) {
	return regularPass(totalScore) || highFinalPass(totalScore, finalScore);
}

int main() {
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
