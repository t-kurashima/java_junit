package tddbc;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ClosedRangeTest {

    @Test
    void 下端点と上端点を取得できる(){
        //準備
        ClossedRange clossedRange = new ClosedRange();
        //実行
        String actual = closedRange.getRange();
        //検証
        assertThat(actual, is("[3,8]"));
    }
}
