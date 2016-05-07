package com.greatwideweb.mock;

import com.greatwideweb.vo.SimpleVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dave on 5/7/2016.
 */
public class DataProvider {

    public List<SimpleVO> getTestData() {
        List<SimpleVO> list = new ArrayList<SimpleVO>();
        list.add(new SimpleVO("Title1", "A descriptive field"));
        list.add(new SimpleVO("Google Talks", "Listen to what google has ot say today"));
        list.add(new SimpleVO("JBaldwin cooking school", "visit Jbalwins cooking school"));
        return list;
    }
}
