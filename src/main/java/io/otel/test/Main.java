package io.otel.test;

import io.opentelemetry.OpenTelemetry;
import io.opentelemetry.context.Scope;
import io.opentelemetry.trace.Span;
import io.opentelemetry.trace.Tracer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(Main.class);
    Tracer tracer = OpenTelemetry.getTracer("main");

    Span main = tracer.spanBuilder("main")
            .startSpan();
    try (Scope scope = tracer.withSpan(main)) {
      MDC.put("test", "test");
      System.out.println(tracer.getCurrentSpan().getContext());
      logger.info("test");
    }
  }
}
