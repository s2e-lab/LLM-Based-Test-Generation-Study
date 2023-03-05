// GridLayout2Test0.java
package src.feudalismGUI;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GridLayout2}.
* It contains ten unit test cases for the {@link GridLayout2#preferredLayoutSize(Container)} method.
*/
class GridLayout2Test0 {

		/**
		* Test case 1.
		* Test method for {@link GridLayout2#preferredLayoutSize(Container)}.
		*/
		@Test
		void testPreferredLayoutSize1() {
				Container parent = new Container();
				parent.setSize(100, 100);
				GridLayout2 gridLayout2 = new GridLayout2();
				Dimension result = gridLayout2.preferredLayoutSize(parent);
				assertEquals(0, result.width);
				assertEquals(0, result.height);
		}
		
		/**
		* Test case 2.
		* Test method for {@link GridLayout2#preferredLayoutSize(Container)}.
		*/
		@Test
		void testPreferredLayoutSize2() {
				Container parent = new Container();
				parent.setSize(100, 100);
				GridLayout2 gridLayout2 = new GridLayout2(1, 0, 0, 0);
				Dimension result = gridLayout2.preferredLayoutSize(parent);
				assertEquals(0, result.width);
				assertEquals(0, result.height);
		}
		
		/**
		* Test case 3.
		* Test method for {@link GridLayout2#preferredLayoutSize(Container)}.
		*/
		@Test
		void testPreferredLayoutSize3() {
				Container parent = new Container();
				parent.setSize(100, 100);
				GridLayout2 gridLayout2 = new GridLayout2(1, 1, 0, 0);
				Dimension result = gridLayout2.preferredLayoutSize(parent);
				assertEquals(0, result.width);
				assertEquals(0, result.height);
		}
		
		/**
		* Test case 4.
		* Test method for {@link GridLayout2#preferredLayoutSize(Container)}.
		*/
		@Test
		void testPreferredLayoutSize4() {
				Container parent = new Container();
				parent.setSize(100, 100);
				GridLayout2 gridLayout2 = new GridLayout2(1, 1, 1, 1);
				Dimension result = gridLayout2.preferredLayoutSize(parent);
				assertEquals(0, result.width);
				assertEquals(0, result.height);
		}
		
		/**
		* Test case 5.
		* Test method for {@link GridLayout2#preferredLayoutSize(Container)}.
		*/
		@Test
		void testPreferredLayoutSize5() {
				Container parent = new Container();
				parent.setSize(100, 100);
				GridLayout2 gridLayout2 = new GridLayout2(1, 1, 1, 1);
				Component component = new Component() {
						@Override
						public Dimension getPreferredSize() {
								return new Dimension(10, 10);
						}
				};
				parent.add(component);
				Dimension result = gridLayout2.preferredLayoutSize(parent);
				assertEquals(12, result.width);
				assertEquals(12, result.height);
		}
		
		/**
		* Test case 6.
		* Test method for {@link GridLayout2#preferredLayoutSize(Container)}.
		*/
		@Test
		void testPreferredLayoutSize6() {
				Container parent = new Container();
				parent.setSize(100, 100);
				GridLayout2 gridLayout2 = new GridLayout2(1, 1, 1, 1);
				Component component1 = new Component() {
						@Override
						public Dimension getPreferredSize() {
								return new Dimension(10, 10);
						}
				};
				Component component2 = new Component() {
						@Override
						public Dimension getPreferredSize() {
								return new Dimension(20, 20);
						}
				};
				parent.add(component1);
				parent.add(component2);
				Dimension result = gridLayout2.preferredLayoutSize(parent);
				assertEquals(22, result.width);
				assertEquals(22, result.height);
		}
		
		/**
		* Test case 7.
		* Test method for {@link GridLayout2#preferredLayoutSize(Container)}.
		*/
		@Test
		void testPreferredLayoutSize7() {
				Container parent = new Container();
				parent.setSize(100, 100);
				GridLayout2 gridLayout2 = new GridLayout2(1, 1, 1, 1);
				Component component1 = new Component() {
						@Override
						public Dimension getPreferredSize() {
								return new Dimension(10, 10);
						}
				};
				Component component2 = new Component() {
						@Override
						public Dimension getPreferredSize() {
								return new Dimension(20, 20);
						}
				};
				Component component3 = new Component() {
						@Override
						public Dimension getPreferredSize() {
								return new Dimension(30, 30);
						}
				};
				parent.add(component1);
				parent.add(component2);
				parent.add(component3);
				Dimension result = gridLayout2.preferredLayoutSize(parent);
				assertEquals(32, result.width);
				assertEquals(32, result.height);
		}
		
		/**
		* Test case 8.
		* Test method for {@link GridLayout2#preferredLayoutSize(Container)}.
		*/
		@Test
		void testPreferredLayoutSize8() {
				Container parent = new Container();
				parent.setSize(100, 100);
				GridLayout2 gridLayout2 = new GridLayout2(1, 1, 1, 1);
				Component component1 = new Component() {
						@Override
						public Dimension getPreferredSize() {
								return new Dimension(10, 10);
						}
				};
				Component component2 = new Component() {
						@Override
						public Dimension getPreferredSize() {
								return new Dimension(20, 20);
						}
				};
				Component component3 = new Component() {
						@Override
						public Dimension getPreferredSize() {
								return new Dimension(30, 30);
						}
				};
				Component component4 = new Component() {
						@Override
						public Dimension getPreferredSize() {
								return new Dimension(40, 40);
						}
				};
				parent.add(component1);
				parent.add(component2);
				parent.add(component3);
				parent.add(component4);
				Dimension result = gridLayout2.preferredLayoutSize(parent