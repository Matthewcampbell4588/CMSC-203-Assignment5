import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
class TwoDimRaggedArrayUtilityGFATestStudent {

private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8,9}};
	
private double[][] dataS= {{4,7,4.4},{1.1,6,4.1,4.5},{3,2},{5,6,1}};

private File inputFile,outputFile;

@Before
public void setUp() throws Exception {
	outputFile = new File("TestOut.txt");
}

@After
public void tearDown() throws Exception {
	dataS = null;
	inputFile = outputFile = null;
}

@Test
public void testGetTotal() {
	double total = TwoDimRaggedArrayUtility.getTotal(dataS);
	assertEquals(49.0,total,.001);
}


@Test
public void testGetAverage() {
	double average = TwoDimRaggedArrayUtility.getAverage(dataS);
	assertEquals(4.083,average,.001);
}

@Test
public void testGetRowTotal() {
	double row0 = TwoDimRaggedArrayUtility.getRowTotal(dataS, 0);
	assertEquals(15.4,row0,.001);
	double row1 = TwoDimRaggedArrayUtility.getRowTotal(dataS, 1);
	assertEquals(16.6,row1,.001);
	double row2 = TwoDimRaggedArrayUtility.getRowTotal(dataS, 2);
	assertEquals(5.0,row2,.001);
	double row3 = TwoDimRaggedArrayUtility.getRowTotal(dataS, 3);
	assertEquals(12.0,row3,.001);
}



@Test
public void testGetColumnTotal() {
	double col0 = TwoDimRaggedArrayUtility.getColumnTotal(dataS, 0);
	assertEquals(13.1,col0,.001);
	double col1 = TwoDimRaggedArrayUtility.getColumnTotal(dataS, 1);
	assertEquals(21.0,col1,.001);
	double col2 = TwoDimRaggedArrayUtility.getColumnTotal(dataS, 2);
	assertEquals(9.5,col2,.001);
	double col3 = TwoDimRaggedArrayUtility.getColumnTotal(dataS, 3);
	assertEquals(4.5,col3,.001);
}



@Test
public void testGetHighestInArray() {
	double highest = TwoDimRaggedArrayUtility.getHighestInArray(dataS);
	assertEquals(7.0,highest,.001);	
}
@Test
public void testGetHighestInRow() {
	double h1 = TwoDimRaggedArrayUtility.getHighestInRow(dataS, 0);
	assertEquals(7.0,h1,.001);
	double h2 = TwoDimRaggedArrayUtility.getHighestInRow(dataS, 1);
	assertEquals(6.0,h2,.001);
	double h3 = TwoDimRaggedArrayUtility.getHighestInRow(dataS, 2);
	assertEquals(3.0,h3,.001);
	double h4 = TwoDimRaggedArrayUtility.getHighestInRow(dataS, 3);
	assertEquals(6.0,h4,.001);
}
@Test
public void testGetLowestInRow() {
	double l1 = TwoDimRaggedArrayUtility.getLowestInRow(dataS, 0);
	assertEquals(4.0,l1,.001);
	double l2 = TwoDimRaggedArrayUtility.getLowestInRow(dataS, 1);
	assertEquals(1.1,l2,.001);
	double l3 = TwoDimRaggedArrayUtility.getLowestInRow(dataS, 2);
	assertEquals(2.0,l3,.001);
	double l4 = TwoDimRaggedArrayUtility.getLowestInRow(dataS, 3);
	assertEquals(1.0,l4,.001);
}
@Test
public void testGetHighestInColumn() {
	double h1 = TwoDimRaggedArrayUtility.getHighestInColumn(dataS, 0);
	assertEquals(5.0,h1,.001);
	double h2 = TwoDimRaggedArrayUtility.getHighestInColumn(dataS, 1);
	assertEquals(7.0,h2,.001);
	double h3 = TwoDimRaggedArrayUtility.getHighestInColumn(dataS, 2);
	assertEquals(4.4,h3,.001);
	double h4 = TwoDimRaggedArrayUtility.getHighestInColumn(dataS, 3);
	assertEquals(4.5,h4,.001);
}

@Test
public void testLowestInColumn() {
	double l1 = TwoDimRaggedArrayUtility.getLowestInColumn(dataS, 0);
	assertEquals(1.1,l1,.001);
	double l2 = TwoDimRaggedArrayUtility.getLowestInColumn(dataS, 1);
	assertEquals(2.0,l2,.001);
	double l3 = TwoDimRaggedArrayUtility.getLowestInColumn(dataS, 2);
	assertEquals(1.0,l3,.001);
	double l4 = TwoDimRaggedArrayUtility.getLowestInColumn(dataS, 3);
	assertEquals(4.5,l4,.001);
}

@Test
public void testLowestInArray() {
	double lowest = TwoDimRaggedArrayUtility.getLowestInArray(dataS);
	assertEquals(1.0,lowest,.001);	
}

@Test
public void testHighestInColumnIndex() {
	int in1 = TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataS, 0);
	assertEquals(3,in1);
	int in2 = TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataS, 1);
	assertEquals(0,in2);
	int in3 = TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataS, 2);
	assertEquals(0,in3);
	int in4 = TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataS, 3);
	assertEquals(1,in4);
}

@Test
public void testLowestInColumnIndex() {
	int in1 = TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataS, 0);
	assertEquals(1,in1);
	int in2 = TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataS, 1);
	assertEquals(2,in2);
	int in3 = TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataS, 2);
	assertEquals(3,in3);
	int in4 = TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataS, 3);
	assertEquals(1,in4);
}
}
