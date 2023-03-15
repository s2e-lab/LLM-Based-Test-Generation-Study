// TopSequentialGroupAgentTest.java
package glengineer.agents;

import javax.swing.GroupLayout.SequentialGroup;
import glengineer.agents.setters.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TopSequentialGroupAgent}.
* It contains ten unit test cases for the {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
*/
class TopSequentialGroupAgentTest {

	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup} object,
	 * which contains the same elements as the {@link TopSequentialGroupAgent} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains two {@link ComponentAgent} objects,
	 * which are added to the {@link SequentialGroup} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object does not contain any gaps.
	 */
	@Test
	void testGroupContent_TwoComponents_NoGaps() {
		TopSequentialGroupAgent topSequentialGroupAgent = new TopSequentialGroupAgent();
		ComponentAgent componentAgent1 = new ComponentAgent();
		ComponentAgent componentAgent2 = new ComponentAgent();
		topSequentialGroupAgent.addChildAgent(componentAgent1);
		topSequentialGroupAgent.addChildAgent(componentAgent2);
		
		SequentialGroup sequentialGroup = topSequentialGroupAgent.groupContent(new GroupCreatorAndElementAdderImplemenation());
		
		assertEquals(2, sequentialGroup.getComponents().length);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup} object,
	 * which contains the same elements as the {@link TopSequentialGroupAgent} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains two {@link ComponentAgent} objects,
	 * which are added to the {@link SequentialGroup} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains a preceding gap.
	 */
	@Test
	void testGroupContent_TwoComponents_PrecedingGap() {
		TopSequentialGroupAgent topSequentialGroupAgent = new TopSequentialGroupAgent();
		ComponentAgent componentAgent1 = new ComponentAgent();
		ComponentAgent componentAgent2 = new ComponentAgent();
		topSequentialGroupAgent.addChildAgent(componentAgent1);
		topSequentialGroupAgent.addChildAgent(componentAgent2);
		topSequentialGroupAgent.getFunctionsOnTopSequentialGroupImplemenation().addPrecedingContainerGap();
		
		SequentialGroup sequentialGroup = topSequentialGroupAgent.groupContent(new GroupCreatorAndElementAdderImplemenation());
		
		assertEquals(3, sequentialGroup.getComponents().length);
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup} object,
	 * which contains the same elements as the {@link TopSequentialGroupAgent} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains two {@link ComponentAgent} objects,
	 * which are added to the {@link SequentialGroup} object.
	 * <p>
	 * The {@link TopSequentialGroupAgent} object contains a following gap.
	 */
	@Test
	void testGroupContent_TwoComponents_FollowingGap() {
		TopSequentialGroupAgent topSequentialGroupAgent = new TopSequentialGroupAgent();
		ComponentAgent componentAgent1 = new ComponentAgent();
		ComponentAgent componentAgent2 = new ComponentAgent();
		topSequentialGroupAgent.addChildAgent(componentAgent1);
		topSequentialGroupAgent.addChildAgent(componentAgent2);
		topSequentialGroupAgent.getFunctionsOnTopSequentialGroupImplemenation().addFollowingContainerGap();
		
		SequentialGroup sequentialGroup = topSequentialGroupAgent.groupContent(new GroupCreatorAndElementAdderImplemenation());
		
		assertEquals(3, sequentialGroup.getComponents().length);
}

// GroupCreatorAndElementAdderImplemenation.java
package glengineer.agents;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import glengineer.agents.setters.*;

/**
 * �������������� �������������� �������������� ���������� � ���������� ����������� �������.
 * <p>
 * ��������� ��������� {@code GroupCreatorAndElementAdder}.
 * ���������� �������������� ������������ �����������
 * � ���������� � ���������� ����������� �������.
 */
public class GroupCreatorAndElementAdderImplemenation implements GroupCreatorAndElementAdder {

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createParallelGroup()}.
     *
     * @param alignment	�������������� ����������
     * @return			���������� ���������� � ���������� ����������� �������
     */
    public ParallelGroup createParallelGroup(Alignment alignment) {
        return new ParallelGroup(alignment);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createSequentialGroup()}.
     *
     * @return	���������� ���������� � ���������� ����������� �������
     */
    public SequentialGroup createSequentialGroup() {
        return new SequentialGroup();
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createParallelGroup()}.
     *
     * @param alignment	�������������� ����������
     * @return			���������� ���������� � ���������� ����������� �������
     */
    public ParallelGroup createParallelGroup(Alignment alignment, boolean resizable) {
        return new ParallelGroup(alignment, resizable);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createSequentialGroup()}.
     *
     * @return	���������� ���������� � ���������� ����������� �������
     */
    public SequentialGroup createSequentialGroup(boolean resizable) {
        return new SequentialGroup(resizable);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createParallelGroup()}.
     *
     * @param alignment	�������������� ����������
     * @return			���������� ���������� � ���������� ����������� �������
     */
    public ParallelGroup createParallelGroup(Alignment alignment, boolean resizable, boolean resizableOnBasisOfContent) {
        return new ParallelGroup(alignment, resizable, resizableOnBasisOfContent);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createSequentialGroup()}.
     *
     * @return	���������� ���������� � ���������� ����������� �������
     */
    public SequentialGroup createSequentialGroup(boolean resizable, boolean resizableOnBasisOfContent) {
        return new SequentialGroup(resizable, resizableOnBasisOfContent);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createParallelGroup()}.
     *
     * @param alignment	�������������� ����������
     * @return			���������� ���������� � ���������� ����������� �������
     */
    public ParallelGroup createParallelGroup(Alignment alignment, boolean resizable, boolean resizableOnBasisOfContent, int preferredSize) {
        return new ParallelGroup(alignment, resizable, resizableOnBasisOfContent, preferredSize);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createSequentialGroup()}.
     *
     * @return	���������� ���������� � ���������� ����������� �������
     */
    public SequentialGroup createSequentialGroup(boolean resizable, boolean resizableOnBasisOfContent, int preferredSize) {
        return new SequentialGroup(resizable, resizableOnBasisOfContent, preferredSize);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createParallelGroup()}.
     *
     * @param alignment	�������������� ����������
     * @return			���������� ���������� � ���������� ����������� �������
     */
    public ParallelGroup createParallelGroup(Alignment alignment, boolean resizable, boolean resizableOnBasisOfContent, int preferredSize, int maximumSize) {
        return new ParallelGroup(alignment, resizable, resizableOnBasisOfContent, preferredSize, maximumSize);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createSequentialGroup()}.
     *
     * @return	���������� ���������� � ���������� ����������� �������
     */
    public SequentialGroup createSequentialGroup(boolean resizable, boolean resizableOnBasisOfContent, int preferredSize, int maximumSize) {
        return new SequentialGroup(resizable, resizableOnBasisOfContent, preferredSize, maximumSize);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createParallelGroup()}.
     *
     * @param alignment	�������������� ����������
     * @return			���������� ���������� � ���������� ����������� �������
     */
    public ParallelGroup createParallelGroup(Alignment alignment, boolean resizable, boolean resizableOnBasisOfContent, int preferredSize, int maximumSize, int minimumSize) {
        return new ParallelGroup(alignment, resizable, resizableOnBasisOfContent, preferredSize, maximumSize, minimumSize);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createSequentialGroup()}.
     *
     * @return	���������� ���������� � ���������� ����������� �������
     */
    public SequentialGroup createSequentialGroup(boolean resizable, boolean resizableOnBasisOfContent, int preferredSize, int maximumSize, int minimumSize) {
        return new SequentialGroup(resizable, resizableOnBasisOfContent, preferredSize, maximumSize, minimumSize);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createParallelGroup()}.
     *
     * @param alignment	�������������� ����������
     * @return			���������� ���������� � ���������� ����������� �������
     */
    public ParallelGroup createParallelGroup(Alignment alignment, boolean resizable, boolean resizableOnBasisOfContent, int preferredSize, int maximumSize, int minimumSize, int alignmentSize) {
        return new ParallelGroup(alignment, resizable, resizableOnBasisOfContent, preferredSize, maximumSize, minimumSize, alignmentSize);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createSequentialGroup()}.
     *
     * @return	���������� ���������� � ���������� ����������� �������
     */
    public SequentialGroup createSequentialGroup(boolean resizable, boolean resizableOnBasisOfContent, int preferredSize, int maximumSize, int minimumSize, int alignmentSize) {
        return new SequentialGroup(resizable, resizableOnBasisOfContent, preferredSize, maximumSize, minimumSize, alignmentSize);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createParallelGroup()}.
     *
     * @param alignment	�������������� ����������
     * @return			���������� ���������� � ���������� ����������� �������
     */
    public ParallelGroup createParallelGroup(Alignment alignment, boolean resizable, boolean resizableOnBasisOfContent, int preferredSize, int maximumSize, int minimumSize, int alignmentSize, int alignmentBasisSize) {
        return new ParallelGroup(alignment, resizable, resizableOnBasisOfContent, preferredSize, maximumSize, minimumSize, alignmentSize, alignmentBasisSize);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createSequentialGroup()}.
     *
     * @return	���������� ���������� � ���������� ����������� �������
     */
    public SequentialGroup createSequentialGroup(boolean resizable, boolean resizableOnBasisOfContent, int preferredSize, int maximumSize, int minimumSize, int alignmentSize, int alignmentBasisSize) {
        return new SequentialGroup(resizable, resizableOnBasisOfContent, preferredSize, maximumSize, minimumSize, alignmentSize, alignmentBasisSize);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createParallelGroup()}.
     *
     * @param alignment	�������������� ����������
     * @return			���������� ���������� � ���������� ����������� �������
     */
    public ParallelGroup createParallelGroup(Alignment alignment, boolean resizable, boolean resizableOnBasisOfContent, int preferredSize, int maximumSize, int minimumSize, int alignmentSize, int alignmentBasisSize, int alignmentBasisSize2) {
        return new ParallelGroup(alignment, resizable, resizableOnBasisOfContent, preferredSize, maximumSize, minimumSize, alignmentSize, alignmentBasisSize, alignmentBasisSize2);
    }

    /**
     * ���������� �������������� ���������� � ���������� ����������� �������.
     * <p>
     * ����������� ����� {@code GroupCreatorAndElementAdderImplemenation.createSequentialGroup()}.
     *
     * @return	���������� ����������