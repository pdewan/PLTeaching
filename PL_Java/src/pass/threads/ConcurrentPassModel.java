package pass.threads;

import pass.model.PassModel;

public interface ConcurrentPassModel extends PassModel{
	void waitForNewScores();

}
