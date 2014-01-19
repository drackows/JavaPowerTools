package pl.inpar.javapowertools.junit.dao;

import java.util.ArrayList;
import java.util.List;

public class FakeDao implements IFakeDao{

	@Override
    public List<String> findAll() {
		ArrayList<String> ret = new ArrayList<String>();
		for (int i=0; i<1000; i++) {
			ret.add(String.format("Some text %d", i));
		}
		try {
	        Thread.sleep(200);
        } catch (InterruptedException e) {
	        e.printStackTrace();
        }
	    return ret;
    }

}
