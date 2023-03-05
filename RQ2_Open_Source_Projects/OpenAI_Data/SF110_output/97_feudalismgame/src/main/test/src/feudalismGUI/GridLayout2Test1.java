// GridLayout2Test1.java
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
* It contains ten unit test cases for the {@link GridLayout2#minimumLayoutSize(Container)} method.
*/
class GridLayout2Test1 {

		/**
		* Test case 1.
		* Test method for {@link GridLayout2#minimumLayoutSize(Container)}.
		*/
		@Test
		void testMinimumLayoutSize1() {
				GridLayout2 gridLayout2 = new GridLayout2();
				Container container = new Container();
				Dimension expected = new Dimension(0, 0);
				Dimension actual = gridLayout2.minimumLayoutSize(container);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* Test method for {@link GridLayout2#minimumLayoutSize(Container)}.
		*/
		@Test
		void testMinimumLayoutSize2() {
				GridLayout2 gridLayout2 = new GridLayout2(1, 0, 0, 0);
				Container container = new Container();
				Dimension expected = new Dimension(0, 0);
				Dimension actual = gridLayout2.minimumLayoutSize(container);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* Test method for {@link GridLayout2#minimumLayoutSize(Container)}.
		*/
		@Test
		void testMinimumLayoutSize3() {
				GridLayout2 gridLayout2 = new GridLayout2(1, 0, 0, 0);
				Container container = new Container();
				Component component = new Component() {
						@Override
						public Dimension getMinimumSize() {
								return new Dimension(0, 0);
						}
				};
				container.add(component);
				Dimension expected = new Dimension(0, 0);
				Dimension actual = gridLayout2.minimumLayoutSize(container);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* Test method for {@link GridLayout2#minimumLayoutSize(Container)}.
		*/
		@Test
		void testMinimumLayoutSize4() {
				GridLayout2 gridLayout2 = new GridLayout2(1, 0, 0, 0);
				Container container = new Container();
				Component component = new Component() {
						@Override
						public Dimension getMinimumSize() {
								return new Dimension(1, 1);
						}
				};
				container.add(component);
				Dimension expected = new Dimension(1, 1);
				Dimension actual = gridLayout2.minimumLayoutSize(container);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* Test method for {@link GridLayout2#minimumLayoutSize(Container)}.
		*/
		@Test
		void testMinimumLayoutSize5() {
				GridLayout2 gridLayout2 = new GridLayout2(1, 0, 0, 0);
				Container container = new Container();
				Component component1 = new Component() {
						@Override
						public Dimension getMinimumSize() {
								return new Dimension(1, 1);
						}
				};
				Component component2 = new Component() {
						@Override
						public Dimension getMinimumSize() {
								return new Dimension(2, 2);
						}
				};
				container.add(component1);
				container.add(component2);
				Dimension expected = new Dimension(2, 2);
				Dimension actual = gridLayout2.minimumLayoutSize(container);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* Test method for {@link GridLayout2#minimumLayoutSize(Container)}.
		*/
		@Test
		void testMinimumLayoutSize6() {
				GridLayout2 gridLayout2 = new GridLayout2(1, 0, 0, 0);
				Container container = new Container();
				Component component1 = new Component() {
						@Override
						public Dimension getMinimumSize() {
								return new Dimension(1, 1);
						}
				};
				Component component2 = new Component() {
						@Override
						public Dimension getMinimumSize() {
								return new Dimension(2, 2);
						}
				};
				Component component3 = new Component() {
						@Override
						public Dimension getMinimumSize() {
								return new Dimension(3, 3);
						}
				};
				container.add(component1);
				container.add(component2);
				container.add(component3);
				Dimension expected = new Dimension(3, 3);
				Dimension actual = gridLayout2.minimumLayoutSize(container);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* Test method for {@link GridLayout2#minimumLayoutSize(Container)}.
		*/
		@Test
		void testMinimumLayoutSize7() {
				GridLayout2 gridLayout2 = new GridLayout2(1, 0, 0, 0);
				Container container = new Container();
				Component component1 = new Component() {
						@Override
						public Dimension getMinimumSize() {
								return new Dimension(1, 1);
						}
				};
				Component component2 = new Component() {
						@Override
						public Dimension getMinimumSize() {
								return new Dimension(2, 2);
						}
				};
				Component component3 = new Component() {
						@Override
						public Dimension getMinimumSize() {
								return new Dimension(3, 3);
						}
				};
				Component component4 = new Component() {
						@Override
						public Dimension getMinimumSize() {
								return new Dimension(4, 4);
						}
				};
				container.add(component1);
				container.add(component2);
				container.add(component3);
				container.add(component4);
				Dimension expected = new Dimension(4, 4);
				Dimension actual = gridLayout2.minimumLayoutSize(container);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* Test method for {@link GridLayout2#minimumLayoutSize(Container)}.
		*/
		@Test
		void testMinimumLayoutSize8() {
				GridLayout2 gridLayout2 = new GridLayout2(1, 0, 0, 0);
				Container container = new Container();
				Component component1 = new Component() {
						@Override
						public Dimension getMinimumSize() {
								return new Dimension(1, 1);
						}
				};
				Component component2 = new Component() {
						@Override
				