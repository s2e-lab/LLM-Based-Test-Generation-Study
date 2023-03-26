// FixSpaces.java
package scenario3;

class FixSpaces {

    /**
     * * Given a string text, replace all spaces in it with underscores,
     * and if a string has more than 2 consecutive spaces,
     * then replace all consecutive spaces with -
     *
     * fixSpaces("Example") == "Example"
     * fixSpaces("Example 1") == "Example_1"
     * fixSpaces(" Example 2") == "_Example_2"
     * fixSpaces(" Example   3") == "_Example-3"
     *
     * > fixSpaces("Example")
     * "Example"
     * > fixSpaces("Mudasir Hanif ")
     * "Mudasir_Hanif_"
     * > fixSpaces("Yellow Yellow  Dirty  Fellow")
     * "Yellow_Yellow__Dirty__Fellow"
     * > fixSpaces("Exa   mple")
     * "Exa-mple"
     * > fixSpaces("   Exa 1 2 2 mple")
     * "-Exa_1_2_2_mple"
     */
    public static String fixSpaces(String text) {
        String result = text.replaceAll(" ", "_");
        if (result.contains("   ")) {
            result = result.replaceAll("   ", "-");
        }
        return result;
    }
}

// FixSpacesTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
    @Test
    void testFixSpaces() {
        assertEquals("Example", FixSpaces.fixSpaces("Example"));
        assertEquals("Example_1", FixSpaces.fixSpaces("Example 1"));
        assertEquals("_Example_2", FixSpaces.fixSpaces(" Example 2"));
        assertEquals("_Example-3", FixSpaces.fixSpaces(" Example   3"));
        assertEquals("Mudasir_Hanif_", FixSpaces.fixSpaces("Mudasir Hanif "));
        assertEquals("Yellow_Yellow__Dirty__Fellow", FixSpaces.fixSpaces("Yellow Yellow  Dirty  Fellow"));
        assertEquals("Exa-mple", FixSpaces.fixSpaces("Exa   mple"));
        assertEquals("-Exa_1_2_2_mple", FixSpaces.fixSpaces("   Exa 1 2 2 mple"));
        assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z"));
        assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z", FixSpaces.fixSpaces("a  b   c    d     e      f       g        h         i          j           k            l             m              n               o                p                 q                  r                   s                    t                     u                      v                       w                        x                         y                          z"));
    }
}