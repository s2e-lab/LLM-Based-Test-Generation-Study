// ContourGeneratorTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourGenerator}.
* It contains ten unit test cases for the {@link ContourGenerator#done()} method.
*/
class ContourGeneratorTest {

    /**
     * Test of done method, of class ContourGenerator.
     */
    @Test
    void testDone() {
        System.out.println("done");
        ContourGenerator instance = new ContourGenerator(new double[][]{{1, 2, 3}, {4, 5, 6}}, new double[][]{{1, 2, 3}, {4, 5, 6}}, new double[][]{{1, 2, 3}, {4, 5, 6}}, new ContourAttrib[1]);
        instance.done();
    }
}

// ContourGenerator.java
package jahuwaldt.plot;

import java.util.*;

/**
 *  <p> An object used to generate a list of contour lines
 *      or paths from a set of gridded three dimensional data.
 *  </p>
 *
 *  <p> Based on contour_plot.c from NeXTcontour1.4 by <NAME>,
 *      pulliam@rft29.nas.nasa.gov, MS 202A-1 NASA Ames Research Center,
 *      Moffett Field, CA 94035.
 *      I don't know how the original Fortran code looked like or where it came from,
 *      other than that NeXTcontour1.4 is based on Pieter Bunings' PLOT3D package
 *      for Computational Fluid Dynamics.
 *  </p>
 *
 *  <p> Ported from C to Java by <NAME>, November 16, 2000.  </p>
 *
 *  <p>  Modified by:  <NAME>  </p>
 *
 * @author <NAME>   Date:  November 11, 2000
 * @version November 23, 2000
 */
public class ContourGenerator {

    //	Debug flag.
    private static final boolean DEBUG = false;

    //	Error messages.
    private static final String kCancelMsg = "Method ContourGenerator.getContours() canceled by user.";

    private static final String kInconsistantArrMsg = "Inconsistant array sizes.";

    private static final String kArrSizeMsg = "Data arrays must have more than one row or column.";

    private static final String kNegLogDataMsg = "Function data must be > 0 for logarithmic intervals.";

    //	Path buffer size.
    private static final int kBufSize = 1000;

    //	The minimum number of points allowed in a contour path.
    private static final int kMinNumPoints = 3;

    //	A list of contour paths.
    private List pathList = new ArrayList();

    //	A flag to indicate that the contours have been computed or not.
    private boolean cCalculated = false;

    //	Data arrays used for generating the contours.
    private double[][] xArray, yArray, funcArray;

    //	Data arrays used when generating contours for 1D X & Y arrays.
    private double[] xArr1D, yArr1D;

    //	Array of contour attributes, one for each contour level.
    private ContourAttrib[] cAttr;

    //	The fraction of the task that is completed.
    private float fracComplete = 0;

    /**
     *  Used to indicate that the user wishes to cancel the calculation
     *  of contours.
     */
    private boolean isCanceled = false;

    //	Variables in the original FORTRAN program.
    private double[] pathbufxt, pathbufyt;

    private int[] pathbufia;

    //	lnstrt=1 indicates starting a new line.
    private int lnstrt;

    private int ignext;

    //	Current contour level index.
    private int icont;

    //	The current contour level.
    private double cont;

    //	i & j start and end index values.
    private int iss, iee, jss, jee;

    //	ima tells which boundary region we are on.
    private int ima;

    //	Index to last element in the IA list.
    private int iae;

    private int ibeg, jbeg;

    //	Indexes into data arrays.
    private int gi, gj;

    //	Data value at i,j in data array.
    private double fij;

    //	Indicates current direction.
    private int idir;

    //	Number of points in current contour line.
    private int np = 0;

    //	Starting point of a contour line.
    private double wx = 0, wy = 0;

    /**
     *  Construct a ContourGenerator object using the specified data arrays
     *  and the specified attribute array.  This constructor allows you
     *  to use data on an uneven X, Y grid.
     *
     *  @param  xArr   2D array containing the grid x coordinate data.
     *  @param  yArr   2D array containing the grid y coordinate data.
     *  @param  fArr   2D array containing the grid function (z) data.
     *  @param  cAttr  Array containing attributes of the contour levels.
     */
    public ContourGenerator(double[][] xArr, double[][] yArr, double[][] fArr, ContourAttrib[] cAttr) {
    }

    /**
     *  Construct a ContourGenerator object using the specified data arrays
     *  and the specified attribute array.  This constructor allows you
     *  to use data on an evenly spaced grid where "X" values are invarient
     *  with "Y" and "Y" values are invarient with "X".  This often occures
     *  where the data is on an evenly spaced cartesian grid.
     *
     *  @param  xArr   1D array containing the grid x coordinate data.
     *  @param  yArr   1D array containing the grid y coordinate data.
     *  @param  fArr   2D array containing the grid function (z) data.
     *  @param  cAttr  Array containing attributes of the contour levels.
     */
    public ContourGenerator(double[] xArr, double[] yArr, double[][] fArr, ContourAttrib[] cAttr) {
    }

    /**
     *  Construct a ContourGenerator object using the specified data arrays.
     *  Contour attributes, including the interval, are generated
     *  automatically.  This constructor allows you to use data on an
     *  uneven X, Y grid.
     *
     *  @param  xArr   2D array containing the grid x coordinate data.
     *  @param  yArr   2D array containing the grid y coordinate data.
     *  @param  fArr   2D array containing the grid function (z) data.
     *  @param  nc     The number of contour levels to generate.
     *  @param  logInterval  Uses a logarithmic contour interval if true, and
     *                       uses a linear interval if false.
     */
    public ContourGenerator(double[][] xArr, double[][] yArr, double[][] fArr, int nc, boolean logInterval) {
    }

    /**
     *  Construct a ContourGenerator object using the specified data arrays.
     *  Contour attributes, including the interval, are generated
     *  automatically.  This constructor allows you
     *  to use data on an evenly spaced grid where "X" values are invarient
     *  with "Y" and "Y" values are invarient with "X".  This often occures
     *  where the data is on an evenly spaced cartesian grid.
     *
     *  @param  xArr   1D array containing the grid x coordinate data.
     *  @param  yArr   1D array containing the grid y coordinate data.
     *  @param  fArr   2D array containing the grid function (z) data.
     *  @param  nc     The number of contour levels to generate.
     *  @param  logInterval  Uses a logarithmic contour interval if true, and
     *                       uses a linear interval if false.
     */
    public ContourGenerator(double[] xArr, double[] yArr, double[][] fArr, int nc, boolean logInterval) {
    }

    /**
     *  Generate the contour paths and return them as an array
     *  of ContourPath objects. If there is a lot of data, this method
     *  method may take a long time, so be patient.  Progress can be
     *  checked from another thread by calling "getProgress()".
     *
     *  @return An array of contour path objects.
     *  @throws InterruptedException if the user cancels this process
     *          (by calling "cancel()" from another thread).
     */
    public ContourPath[] getContours() throws InterruptedException;

    /**
     *  Returns true if the contour generation process is done.  False if it is not.
     */
    public boolean done();

    /**
     *  Call this method to cancel the generation of contours.
     */
    public void cancel();

    /**
     *  Returns the progress of the currently executing contour generation
     *