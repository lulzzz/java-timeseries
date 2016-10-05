package optim;

import org.junit.Test;

import linear.doubles.Vector;

public final class BFGSSpec {
  
  @Test
  public void testBFGS() {
    AbstractMultivariateFunction f = new RosenbrockFunction();
    Vector startingPoint = new Vector(0.5, 1.5);
    final double tol = 1E-6;
    BFGS solver = new BFGS(f, startingPoint, tol, 1e-8);
    System.out.println(solver.functionValue());
    System.out.println(solver.parameters());
    System.out.println(f.functionEvaluations);
    System.out.println(f.gradientEvalutations);
  }

}
