package pl.inpar.javapowertools.junitperf;

import junit.framework.TestCase;
import org.junit.Test;
import pl.inpar.javapowertools.junit.dao.FakeDao;
import pl.inpar.javapowertools.junit.dao.IFakeDao;

import java.util.List;

public class FakeDaoTest extends TestCase {

    private IFakeDao fakeDao;

    public FakeDaoTest() {
        super("testFindAll");
    }

    @Override
    protected void setUp() throws Exception {
        fakeDao = new FakeDao();
    }

    @Test
    public void testFindAll() {
        List<String> all = fakeDao.findAll();
        assertTrue(all.size() > 0);
    }

}
