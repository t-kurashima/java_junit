package tddbc;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ClosedRangeTest {

    @Test
    public void 下端点3と上端点8を取得できる(){
        //準備
        ClosedRange closedRange = new ClosedRange(3, 8);
        //実行
        String actual = closedRange.getRange();
        //検証
        assertThat(actual, is("[3,8]"));
    }

    @Test
    public void 下端点4と上端点7を取得できる(){
        //準備
        ClosedRange closedRange = new ClosedRange(4, 7);
        //実行
        String actual = closedRange.getRange();
        //検証
        assertThat(actual, is("[4,7]"));
    }

    @Test
    public void 指定した整数を含むかどうかを判定できる(){
        //準備
        ClosedRange closedRange = new ClosedRange(0,10);
        //実行
        boolean actual = closedRange.include(1);
        //検証
        assertThat(actual, is(true));
    }

    @Test
    public void 指定した整数を含まないかどうかを判定できる(){
        //準備
        ClosedRange closedRange = new ClosedRange(0,10);
        //実行
        boolean actual = closedRange.include(1);
        //検証
        assertThat(actual, is(true));
    }
}
