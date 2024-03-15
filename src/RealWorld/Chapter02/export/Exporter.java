package RealWorld.Chapter02.export;

import RealWorld.Chapter02.domain.SummaryStatistics;

public interface Exporter {
    String export(SummaryStatistics summaryStatistics);
}
