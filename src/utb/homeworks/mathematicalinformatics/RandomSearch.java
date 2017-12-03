package utb.homeworks.mathematicalinformatics;
public class RandomSearch extends VariablesHolder {

	public RandomSearch() {
		for (int i = 0; i < 1000; i++) {
			x1[i] = -5 + 10 * Math.random();
			x2[i] = -5 + 10 * Math.random();
			if (costFunction2ndDeJong(x1[i], x2[i]) < bestSolution) {
				x1best = x1[i];
				x2best = x2[i];
				bestSolution = costFunction2ndDeJong(x1best, x2best);
			}
			costValueEvolution[i] = costFunction2ndDeJong(x1best, x2best);
		}
	}

	double costFunction2ndDeJong(double x1, double x2) {
		return 100 * Math.pow((Math.pow(x1, 2) - x2), 2) + Math.pow((1 - x1), 2);
	}

}
