package pl.inpar.javapowertools.dbunit;

import java.io.File;
import java.io.FileInputStream;

import org.dbunit.DBTestCase;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlProducer;
import org.xml.sax.InputSource;

public class DbTest extends DBTestCase {

	@Override
	protected IDataSet getDataSet() throws Exception {
		return new FlatXmlDataSet(new FlatXmlProducer(new InputSource(new FileInputStream(new File("......???.....")))));
	}

}
