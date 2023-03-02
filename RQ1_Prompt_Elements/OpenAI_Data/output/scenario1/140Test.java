// FixSpacesTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
@Test
		void testFixSpaces1() {
				assertEquals("", FixSpaces.fixSpaces(""));
		}
		
		@Test
		void testFixSpaces2() {
				assertEquals("a", FixSpaces.fixSpaces("a"));
		}
		
		@Test
		void testFixSpaces3() {
				assertEquals("a_b", FixSpaces.fixSpaces("a b"));
		}
		
		@Test
		void testFixSpaces4() {
				assertEquals("a_b_c", FixSpaces.fixSpaces("a b c"));
		}
		
		@Test
		void testFixSpaces5() {
				assertEquals("a_b_c_d", FixSpaces.fixSpaces("a b c d"));
		}
		
		@Test
		void testFixSpaces6() {
				assertEquals("a_b_c_d_e", FixSpaces.fixSpaces("a b c d e"));
		}
		
		@Test
		void testFixSpaces7() {
				assertEquals("a_b_c_d_e_f", FixSpaces.fixSpaces("a b c d e f"));
		}
		
		@Test
		void testFixSpaces8() {
				assertEquals("a_b_c_d_e_f_g", FixSpaces.fixSpaces("a b c d e f g"));
		}
		
		@Test
		void testFixSpaces9() {
				assertEquals("a_b_c_d_e_f_g_h", FixSpaces.fixSpaces("a b c d e f g h"));
		}
		
		@Test
		void testFixSpaces10() {
				assertEquals("a_b_c_d_e_f_g_h_i", FixSpaces.fixSpaces("a b c d e f g h i"));
		}
		
		@Test
		void testFixSpaces11() {
				assertEquals("a_b_c_d_e_f_g_h_i_j", FixSpaces.fixSpaces("a b c d e f g h i j"));
		}
		
		@Test
		void testFixSpaces12() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k", FixSpaces.fixSpaces("a b c d e f g h i j k"));
		}
		
		@Test
		void testFixSpaces13() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l", FixSpaces.fixSpaces("a b c d e f g h i j k l"));
		}
		
		@Test
		void testFixSpaces14() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m", FixSpaces.fixSpaces("a b c d e f g h i j k l m"));
		}
		
		@Test
		void testFixSpaces15() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n", FixSpaces.fixSpaces("a b c d e f g h i j k l m n"));
		}
		
		@Test
		void testFixSpaces16() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o"));
		}
		
		@Test
		void testFixSpaces17() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p"));
		}
		
		@Test
		void testFixSpaces18() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q"));
		}
		
		@Test
		void testFixSpaces19() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r"));
		}
		
		@Test
		void testFixSpaces20() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s"));
		}
		
		@Test
		void testFixSpaces21() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t"));
		}
		
		@Test
		void testFixSpaces22() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u"));
		}
		
		@Test
		void testFixSpaces23() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v"));
		}
		
		@Test
		void testFixSpaces24() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w"));
		}
		
		@Test
		void testFixSpaces25() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x"));
		}
		
		@Test
		void testFixSpaces26() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y"));
		}
		
		@Test
		void testFixSpaces27() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z"));
		}
		
		@Test
		void testFixSpaces28() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a"));
		}
		
		@Test
		void testFixSpaces29() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b"));
		}
		
		@Test
		void testFixSpaces30() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c"));
		}
		
		@Test
		void testFixSpaces31() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d"));
		}
		
		@Test
		void testFixSpaces32() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e"));
		}
		
		@Test
		void testFixSpaces33() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f"));
		}
		
		@Test
		void testFixSpaces34() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g"));
		}
		
		@Test
		void testFixSpaces35() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h"));
		}
		
		@Test
		void testFixSpaces36() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i"));
		}
		
		@Test
		void testFixSpaces37() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i_j", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j"));
		}
		
		@Test
		void testFixSpaces38() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i_j_k", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k"));
		}
		
		@Test
		void testFixSpaces39() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i_j_k_l", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l"));
		}
		
		@Test
		void testFixSpaces40() {
				assertEquals("a_b_c_d_e_f_g_h_i_j_k_l_m_n_o_p_q_r_s_t_u_v_w_x_y_z_a_b_c_d_e_f_g_h_i_j_k_l_m", FixSpaces.fixSpaces("a b c d e f g h i j k l m n o p q r s t u v w x y z a