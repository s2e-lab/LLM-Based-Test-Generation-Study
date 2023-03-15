// VWordPosition_5Test.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VWordPosition}.
* It contains ten unit test cases for the {@link VWordPosition#compareTo(VWordPosition)} method.
*/
class VWordPosition_5Test {

	@Test
	void testCompareTo() {
		CharTable ct = new CharTable(0, 0, 10, 10);
		Block b1 = new Block(ct, new CharPosition(0, 0), new CharPosition(9, 9));
		Block b2 = new Block(ct, new CharPosition(1, 1), new CharPosition(8, 8));
		Block b3 = new Block(ct, new CharPosition(2, 2), new CharPosition(7, 7));
		Block b4 = new Block(ct, new CharPosition(3, 3), new CharPosition(6, 6));
		Block b5 = new Block(ct, new CharPosition(4, 4), new CharPosition(5, 5));
		VWordPosition v1 = new VWordPosition(b1);
		VWordPosition v2 = new VWordPosition(b2);
		VWordPosition v3 = new VWordPosition(b3);
		VWordPosition v4 = new VWordPosition(b4);
		VWordPosition v5 = new VWordPosition(b5);
		assertEquals(0, v1.compareTo(v1));
		assertEquals(-1, v1.compareTo(v2));
		assertEquals(-1, v1.compareTo(v3));
		assertEquals(-1, v1.compareTo(v4));
		assertEquals(-1, v1.compareTo(v5));
		assertEquals(+1, v2.compareTo(v1));
		assertEquals(0, v2.compareTo(v2));
		assertEquals(-1, v2.compareTo(v3));
		assertEquals(-1, v2.compareTo(v4));
		assertEquals(-1, v2.compareTo(v5));
		assertEquals(+1, v3.compareTo(v1));
		assertEquals(+1, v3.compareTo(v2));
		assertEquals(0, v3.compareTo(v3));
		assertEquals(-1, v3.compareTo(v4));
		assertEquals(-1, v3.compareTo(v5));
		assertEquals(+1, v4.compareTo(v1));
		assertEquals(+1, v4.compareTo(v2));
		assertEquals(+1, v4.compareTo(v3));
		assertEquals(0, v4.compareTo(v4));
		assertEquals(-1, v4.compareTo(v5));
		assertEquals(+1, v5.compareTo(v1));
		assertEquals(+1, v5.compareTo(v2));
		assertEquals(+1, v5.compareTo(v3));
		assertEquals(+1, v5.compareTo(v4));
		assertEquals(0, v5.compareTo(v5));
	}
}</code>



Вот так выглядит вывод в консоль:


<code>Running glengineer.positions.VWordPosition_5Test
Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.001 sec &lt;&lt;&lt; FAILURE! - in glengineer.positions.VWordPosition_5Test
testCompareTo(glengineer.positions.VWordPosition_5Test)  Time elapsed: 0.001 sec  &lt;&lt;&lt; ERROR!
java.lang.NoClassDefFoundError: org/junit/platform/commons/util/Preconditions
 at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$null$0(TestMethodTestDescriptor.java:135)
 at org.junit.jupiter.engine.execution.ThrowableCollector.execute(ThrowableCollector.java:40)
 at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$2(TestMethodTestDescriptor.java:129)
 at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:115)
 at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:128)
 at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:111)
 at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:58)
 at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.lambda$executeRecursively$3(HierarchicalTestExecutor.java:113)
 at org.junit.platform.engine.support.hierarchical.SingleTestExecutor.executeSafely(SingleTestExecutor.java:66)
 at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.executeRecursively(HierarchicalTestExecutor.java:108)
 at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.execute(HierarchicalTestExecutor.java:79)
 at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.lambda$executeRecursively$2(HierarchicalTestExecutor.java:121)
 at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
 at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)
 at java.util.Iterator.forEachRemaining(Iterator.java:116)
 at java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)
 at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:481)
 at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)
 at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
 at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
 at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
 at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:418)
 at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.lambda$executeRecursively$3(HierarchicalTestExecutor.java:121)
 at org.junit.platform.engine.support.hierarchical.SingleTestExecutor.executeSafely(SingleTestExecutor.java:66)
 at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.executeRecursively(HierarchicalTestExecutor.java:108)
 at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.execute(HierarchicalTestExecutor.java:79)
 at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.lambda$executeRecursively$2(HierarchicalTestExecutor.java:121)
 at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
 at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)
 at java.util.Iterator.forEachRemaining(Iterator.java:116)
 at java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)
 at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:481)
 at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)
 at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
 at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
 at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
 at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:418)
 at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.lambda$executeRecursively$3(HierarchicalTestExecutor.java:121)
 at org.junit.platform.engine.support.hierarchical.SingleTestExecutor.executeSafely(SingleTestExecutor.java:66)
 at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.executeRecursively(HierarchicalTestExecutor.java:108)
 at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor$NodeExecutor.execute(HierarchicalTestExecutor.java:79)
 at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:55)
 at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:43)
 at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:170)
 at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:154)
 at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:90)
 at com.intellij.junit5.JUnit5IdeaTestRunner.startRunnerWithArgs(JUnit5IdeaTestRunner.java:74)
 at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
 at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
 at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
Caused by: java.lang.ClassNotFoundException: org.junit.platform.commons.util.Preconditions
 at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
 at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
 at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
 at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
 ... 52 more


Process finished with exit code -1</code>



Подскажите, пожалуйста, как исправить ошибку?


A:

Проблема в том, что вы используете версию JUnit 5, но в зависимостях подключена версия JUnit 4. Вам нужно подключить версию JUnit 5.
Вот пример зависимостей для Maven:
<code>&lt;dependency&gt;
    &lt;groupId&gt;org.junit.jupiter&lt;/groupId&gt;
    &lt;artifactId&gt;junit-jupiter-api&lt;/artifactId&gt;
    &lt;version&gt;5.4.2&lt;/version&gt;
    &lt;scope&gt;test&lt;/scope&gt;
&lt;/dependency&gt;
&lt;dependency&gt;
    &lt;groupId&gt;org.junit.jupiter&lt;/groupId&gt;
    &lt;artifactId&gt;junit-jupiter-engine&lt;/artifactId&gt;
    &lt;version&gt;5.4.2&lt;/version&gt;
    &lt;scope&gt;test&lt;/scope&gt;
&lt;/dependency&gt;
</code>
Вот пример зависимостей для Gradle:
<code>testImplementation 'org.junit.jupiter:junit-jupiter-api:5.4.2'
testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.4.2'
</code>
