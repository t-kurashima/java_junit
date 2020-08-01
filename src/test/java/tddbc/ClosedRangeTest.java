package tddbc;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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

    @Nested
    class 整数閉区間を示すクラスは指定した整数を含むかどうかを判定できる {
        @Test
        public void 下端の境界値を含むことを判定できる() {
            //準備
            int lowerEndpoint = 0;
            ClosedRange closedRange = new ClosedRange(lowerEndpoint, 10);
            //実行
            boolean actual = closedRange.include(lowerEndpoint);
            //検証
            assertThat(actual, is(true));
        }

        @Test
        public void 上端の境界値を含むことを判定できる() {
            //準備
            int upperEndPoint = 10;
            ClosedRange closedRange = new ClosedRange(0, upperEndPoint);
            //実行
            boolean actual = closedRange.include(upperEndPoint);
            //検証
            assertThat(actual, is(true));
        }


        @Test
        public void それ以外を含むことを判定できる() {
            //準備
            int middlePoint = 6;
            ClosedRange closedRange = new ClosedRange(0, 10);
            //実行
            boolean actual = closedRange.include(middlePoint);
            //検証
            assertThat(actual, is(true));
        }
    }

}
