package pl.inpar.javapowertools.junitperf;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import pl.inpar.javapowertools.junit.dao.FakeDao;
import pl.inpar.javapowertools.junit.dao.IFakeDao;

public class FakeDaoTest extends TestCase {

	private IFakeDao fakeDao;

    public FakeDaoTest(String methodName) {
        super(methodName);
    }

    @Override
    protected void setUp() throws Exception {
        fakeDao = new FakeDao();
        System.out.println(getClass().getName()+": initDao");
    }

    @Test
    public void testFindAll() {
        List<String> all = fakeDao.findAll();
        assertTrue(all.size() > 0);
	}

    @Test
    public void testFindAll2() {
        List<String> all = fakeDao.findAll();
        assertTrue(all.size() > 5);
	}
	

}
