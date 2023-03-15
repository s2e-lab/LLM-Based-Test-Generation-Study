// CoordSystemUtilities_0Test.java
package de.progra.charting;

import java.awt.font.FontRenderContext;
import java.text.DecimalFormat;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import de.progra.charting.model.ChartDataModelConstraints;
import de.progra.charting.model.ChartDataModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CoordSystemUtilities}.
* It contains ten unit test cases for the {@link CoordSystemUtilities#computeLeftMargin()} method.
*/
class CoordSystemUtilities_0Test {

		private CoordSystemUtilities coordSystemUtilities;
		
		private CoordSystem coordSystem;
		
		private ChartDataModelConstraints chartDataModelConstraints;
		
		private ChartDataModelConstraints chartDataModelConstraints2;
		
		private ChartDataModel chartDataModel;
		
		private Graphics2D graphics2D;
		
		private FontRenderContext fontRenderContext;
		
		private Font font;
		
		private AffineTransform affineTransform;
		
		private Line2D line2D;
		
		private Point2D point2D;
		
		private Rectangle2D rectangle2D;
		
		private TextLayout textLayout;
		
		private DecimalFormat decimalFormat;
		
		private Color color;
		
		private double double0;
		
		private double double1;
		
		private double double2;
		
		private double double3;
		
		private double double4;
		
		private double double5;
		
		private double double6;
		
		private double double7;
		
		private double double8;
		
		private double double9;
		
		private double double10;
		
		private double double11;
		
		private double double12;
		
		private double double13;
		
		private double double14;
		
		private double double15;
		
		private double double16;
		
		private double double17;
		
		private double double18;
		
		private double double19;
		
		private double double20;
		
		private double double21;
		
		private double double22;
		
		private double double23;
		
		private double double24;
		
		private double double25;
		
		private double double26;
		
		private double double27;
		
		private double double28;
		
		private double double29;
		
		private double double30;
		
		private double double31;
		
		private double double32;
		
		private double double33;
		
		private double double34;
		
		private double double35;
		
		private double double36;
		
		private double double37;
		
		private double double38;
		
		private double double39;
		
		private double double40;
		
		private double double41;
		
		private double double42;
		
		private double double43;
		
		private double double44;
		
		private double double45;
		
		private double double46;
		
		private double double47;
		
		private double double48;
		
		private double double49;
		
		private double double50;
		
		private double double51;
		
		private double double52;
		
		private double double53;
		
		private double double54;
		
		private double double55;
		
		private double double56;
		
		private double double57;
		
		private double double58;
		
		private double double59;
		
		private double double60;
		
		private double double61;
		
		private double double62;
		
		private double double63;
		
		private double double64;
		
		private double double65;
		
		private double double66;
		
		private double double67;
		
		private double double68;
		
		private double double69;
		
		private double double70;
		
		private double double71;
		
		private double double72;
		
		private double double73;
		
		private double double74;
		
		private double double75;
		
		private double double76;
		
		private double double77;
		
		private double double78;
		
		private double double79;
		
		private double double80;
		
		private double double81;
		
		private double double82;
		
		private double double83;
		
		private double double84;
		
		private double double85;
		
		private double double86;
		
		private double double87;
		
		private double double88;
		
		private double double89;
		
		private double double90;
		
		private double double91;
		
		private double double92;
		
		private double double93;
		
		private double double94;
		
		private double double95;
		
		private double double96;
		
		private double double97;
		
		private double double98;
		
		private double double99;
		
		private double double100;
		
		private double double101;
		
		private double double102;
		
		private double double103;
		
		private double double104;
		
		private double double105;
		
		private double double106;
		
		private double double107;
		
		private double double108;
		
		private double double109;
		
		private double double110;
		
		private double double111;
		
		private double double112;
		
		private double double113;
		
		private double double114;
		
		private double double115;
		
		private double double116;
		
		private double double117;
		
		private double double118;
		
		private double double119;
		
		private double double120;
		
		private double double121;
		
		private double double122;
		
		private double double123;
		
		private double double124;
		
		private double double125;
		
		private double double126;
		
		private double double127;
		
		private double double128;
		
		private double double129;
		
		private double double130;
		
		private double double131;
		
		private double double132;
		
		private double double133;
		
		private double double134;
		
		private double double135;
		
		private double double136;
		
		private double double137;
		
		private double double138;
		
		private double double139;
		
		private double double140;
		
		private double double141;
		
		private double double142;
		
		private double double143;
		
		private double double144;
		
		private double double145;
		
		private double double146;
		
		private double double147;
		
		private double double148;
		
		private double double149;
		
		private double double150;
		
		private double double151;
		
		private double double152;
		
		private double double153;
		
		private double double154;
		
		private double double155;
		
		private double double156;
		
		private double double157;
		
		private double double158;
		
		private double double159;
		
		private double double160;
		
		private double double161;
		
		private double