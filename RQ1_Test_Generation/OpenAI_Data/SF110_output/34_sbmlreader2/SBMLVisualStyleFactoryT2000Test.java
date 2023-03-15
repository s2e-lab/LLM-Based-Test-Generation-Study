// SBMLVisualStyleFactoryTest.java
package sbmlreader2;

/*
 Copyright (c) 2006, 2007, The Cytoscape Consortium (www.cytoscape.org)

 The Cytoscape Consortium is:
 - Institute for Systems Biology
 - University of California San Diego
 - Memorial Sloan-Kettering Cancer Center
 - Institut Pasteur
 - Agilent Technologies

 This library is free software; you can redistribute it and/or modify it
 under the terms of the GNU Lesser General Public License as published
 by the Free Software Foundation; either version 2.1 of the License, or
 any later version.

 This library is distributed in the hope that it will be useful, but
 WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 documentation provided hereunder is on an "as is" basis, and the
 Institute for Systems Biology and the Whitehead Institute
 have no obligations to provide maintenance, support,
 updates, enhancements or modifications.  In no event shall the
 Institute for Systems Biology and the Whitehead Institute
 be liable to any party for direct, indirect, special,
 incidental or consequential damages, including lost profits, arising
 out of the use of this software and its documentation, even if the
 Institute for Systems Biology and the Whitehead Institute
 have been advised of the possibility of such damage.  See
 the GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation,
 Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
*/
import cytoscape.*;
import cytoscape.visual.*;
import cytoscape.visual.calculators.*;
import cytoscape.visual.mappings.*;
import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLVisualStyleFactory}.
* It contains ten unit test cases for the {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
*/
class SBMLVisualStyleFactoryTest {

	/**
	 * Test of createVisualStyle method, of class SBMLVisualStyleFactory.
	 */
	@Test
	void testCreateVisualStyle() {
		System.out.println("createVisualStyle");
		CyNetwork network = null;
		VisualStyle result = SBMLVisualStyleFactory.createVisualStyle(network);
		assertNotNull(result);
	}
	
}

// SBMLReader2.java
package sbmlreader2;

/*
 Copyright (c) 2006, 2007, The Cytoscape Consortium (www.cytoscape.org)

 The Cytoscape Consortium is:
 - Institute for Systems Biology
 - University of California San Diego
 - Memorial Sloan-Kettering Cancer Center
 - Institut Pasteur
 - Agilent Technologies

 This library is free software; you can redistribute it and/or modify it
 under the terms of the GNU Lesser General Public License as published
 by the Free Software Foundation; either version 2.1 of the License, or
 any later version.

 This library is distributed in the hope that it will be useful, but
 WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 documentation provided hereunder is on an "as is" basis, and the
 Institute for Systems Biology and the Whitehead Institute
 have no obligations to provide maintenance, support,
 updates, enhancements or modifications.  In no event shall the
 Institute for Systems Biology and the Whitehead Institute
 be liable to any party for direct, indirect, special,
 incidental or consequential damages, including lost profits, arising
 out of the use of this software and its documentation, even if the
 Institute for Systems Biology and the Whitehead Institute
 have been advised of the possibility of such damage.  See
 the GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation,
 Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
*/
import cytoscape.*;
import cytoscape.data.*;
import cytoscape.data.readers.*;
import cytoscape.plugin.*;
import cytoscape.util.*;
import cytoscape.view.*;
import cytoscape.visual.*;
import cytoscape.visual.calculators.*;
import cytoscape.visual.mappings.*;
import giny.model.*;
import giny.view.*;
import java.awt.Color;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.xml.stream.*;
import org.sbml.jsbml.*;
import org.sbml.jsbml.ext.layout.*;
import org.sbml.jsbml.ext.render.*;
import org.sbml.jsbml.ext.render.director.*;
import org.sbml.jsbml.util.*;
import org.sbml.jsbml.xml.stax.*;

/**
 * SBMLReader2.java
 * This class reads SBML files and creates a Cytoscape network.
 *
 * @author W.P.A. Ligtenberg, Eindhoven University of Technology
 */
public class SBMLReader2 implements CytoscapePlugin {

    /**
     * The constructor.
     */
    public SBMLReader2() {
        // Register the SBML file filter
        Cytoscape.getImportHandler().addFilter(new SBMLFileFilter());
        // Register the SBML reader
        Cytoscape.getImportHandler().addReader(new SBMLReader());
    }

    /**
     * The SBML file filter.
     */
    public class SBMLFileFilter extends CyFileFilter {

        /**
         * The constructor.
         */
        public SBMLFileFilter() {
            super("sbml", "SBML files", new String[]{"sbml", "xml"});
        }
    }

    /**
     * The SBML reader.
     */
    public class SBMLReader implements GraphReader {

        /**
         * The constructor.
         */
        public SBMLReader() {
        }

        /**
         * Reads the SBML file and creates a Cytoscape network.
         *
         * @param fileName The SBML file name.
         * @return The Cytoscape network.
         */
        public CyNetwork readFile(String fileName) {
            // Create a new Cytoscape network
            CyNetwork network = Cytoscape.createNetwork(fileName);
            // Read the SBML file
            SBMLDocument document = null;
            try {
                document = SBMLReader.read(new File(fileName));
            } catch (XMLStreamException e) {
                System.err.println("Error while reading the SBML file: " + e.getMessage());
                return null;
            }
            // Get the SBML model
            Model model = document.getModel();
            // Get the SBML layout
            LayoutModelPlugin layoutModel = (LayoutModelPlugin) model.getPlugin("layout");
            // Get the SBML render
            RenderLayoutPlugin renderLayout = (RenderLayoutPlugin) model.getPlugin("render");
            // Get the SBML list of species
            ListOf<Species> speciesList = model.getListOfSpecies();
            // Get the SBML list of reactions
            ListOf<Reaction> reactionList = model.getListOfReactions();
            // Get the SBML list of compartments
            ListOf<Compartment> compartmentList = model.getListOfCompartments();
            // Get the SBML list of species types
            ListOf<SpeciesType> speciesTypeList = model.getListOfSpeciesTypes();
            // Get the SBML list of compartments
            ListOf<CompartmentType> compartmentTypeList = model.getListOfCompartmentTypes();
            // Get the SBML list of unit definitions
            ListOf<UnitDefinition> unitDefinitionList = model.getListOfUnitDefinitions();
            // Get the SBML list of parameters
            ListOf<Parameter> parameterList = model.getListOfParameters();
            // Get the SBML list of initial assignments
            ListOf<InitialAssignment> initialAssignmentList = model.getListOfInitialAssignments();
            // Get the SBML list of rules
            ListOf<Rule> ruleList = model.getListOfRules();
            // Get the SBML list of constraints
            ListOf<Constraint> constraintList = model.getListOfConstraints();
            // Get the SBML list of events
            ListOf<Event> eventList = model.getListOfEvents();
            // Get the SBML list of function definitions
            ListOf<FunctionDefinition> functionDefinitionList = model.getListOfFunctionDefinitions();
            // Get the SBML list of reactions
            ListOf<Reaction> reactionList2 = model.getListOfReactions();
            // Get the SBML list of species references
            ListOf<SpeciesReference> speciesReferenceList = model.getListOfSpeciesReferences();
            // Get the SBML list of modifiers
            ListOf<ModifierSpeciesReference> modifierSpeciesReferenceList = model.getListOfModifierSpeciesReferences();
            // Get the SBML list of local parameters
            ListOf<LocalParameter> localParameterList = model.getListOfLocalParameters();
            // Get the SBML list of kinetic laws
            ListOf<KineticLaw> kineticLawList = model.getListOfKineticLaws();
            // Get the SBML list of species references
            ListOf<SpeciesReference> speciesReferenceList2 = model.getListOfSpeciesReferences();
            // Get the SBML list of modifiers
            ListOf<ModifierSpeciesReference> modifierSpeciesReferenceList2 = model.getListOfModifierSpeciesReferences();
            // Get the SBML list of local parameters
            ListOf<LocalParameter> localParameterList2 = model.getListOfLocalParameters();
            // Get the SBML list of kinetic laws
            ListOf<KineticLaw> kineticLawList2 = model.getListOfKineticLaws();
            // Get the SBML list of species references
            ListOf<SpeciesReference> speciesReferenceList3 = model.getListOfSpeciesReferences();
            // Get the SBML list of modifiers
            ListOf<ModifierSpeciesReference> modifierSpeciesReferenceList3 = model.getListOfModifierSpeciesReferences();
            // Get the SBML list of local parameters
            ListOf<LocalParameter> localParameterList