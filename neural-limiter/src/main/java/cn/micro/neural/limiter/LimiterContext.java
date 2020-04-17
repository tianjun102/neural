package cn.micro.neural.limiter;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * LimiterContext
 *
 * @author lry
 */
@Data
@ToString
public class LimiterContext implements Serializable {

    private static final InheritableThreadLocal<LimiterContext> THREAD_LOCAL = new InheritableThreadLocal<>();

    public static void set(LimiterContext limiterContext) {
        THREAD_LOCAL.set(limiterContext);
    }

    public static LimiterContext get() {
        return THREAD_LOCAL.get();
    }

    public static void remove() {
        THREAD_LOCAL.remove();
    }

}