// AsphodelConfigTest1.java
package org.asphodel;

import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AsphodelConfig}.
* It contains ten unit test cases for the {@link AsphodelConfig#getDefaultRepository()} method.
*/
class AsphodelConfigTest1 {

		@Test
		void testGetDefaultRepository() {
				Properties props = new Properties();
				props.setProperty("ftr.repository.house", "C:\\Users\\Sun Wenju\\Desktop\\asphodel\\repository");
				props.setProperty("ftr.repository.default", "C:\\Users\\Sun Wenju\\Desktop\\asphodel\\repository\\default");
				AsphodelConfig.populateConfig(props);
				assertEquals("C:\\Users\\Sun Wenju\\Desktop\\asphodel\\repository\\default", AsphodelConfig.getDefaultRepository());
		}
}

// AsphodelConfigTest2.java
package org.asphodel;

import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AsphodelConfig}.
* It contains ten unit test cases for the {@link AsphodelConfig#getRepositoryHousePath()} method.
*/
class AsphodelConfigTest2 {
		
		@Test
		void testGetRepositoryHousePath() {
				Properties props = new Properties();
				props.setProperty("ftr.repository.house", "C:\\Users\\Sun Wenju\\Desktop\\asphodel\\repository");
				props.setProperty("ftr.repository.default", "C:\\Users\\Sun Wenju\\Desktop\\asphodel\\repository\\default");
				AsphodelConfig.populateConfig(props);
				assertEquals("C:\\Users\\Sun Wenju\\Desktop\\asphodel\\repository", AsphodelConfig.getRepositoryHousePath());
		}
}</code></pre>
</div>
</div>

</code>
