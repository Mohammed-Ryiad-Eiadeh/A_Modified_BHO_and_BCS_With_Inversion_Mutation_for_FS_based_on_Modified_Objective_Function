package FS_Based_on_modified_FF.Main;

import FS_Based_on_modified_FF.Plots.BoxPlot;
import FS_Based_on_modified_FF.Plots.ConvergenceCurvePlot;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

public class DisplayCurvesMain {
    public static void main(String[] args) throws IOException {
        var m1 = new HashMap<String, Double[]>(){{
            put("CS-no correlation", new Double[] {0.7272207130730053, 0.7302465195246179, 0.7332336162988116, 0.7389887945670629, 0.7399297113752122, 0.741383531409168, 0.7425354838709677, 0.7439205432937182, 0.7462271646859084, 0.7471487266553481, 0.7480831918505942, 0.7480831918505942, 0.7480831918505942, 0.7480831918505942, 0.7480831918505942, 0.7480831918505942, 0.7480864176570459, 0.7480864176570459, 0.7480864176570459, 0.7480864176570459, 0.7480864176570459, 0.7480864176570459, 0.7480864176570459, 0.7480864176570459, 0.7480896434634976});
        }};
        var m2 = new HashMap<String, Double[]>(){{
            put("MBHO-no correlation", new Double[] {0.7268485568760612, 0.7323453310696095, 0.7409560271646859, 0.7422390492359932, 0.7433410865874363, 0.743844312393888, 0.7438770797962648, 0.7444200339558575, 0.7506648556876062, 0.7511122241086587, 0.7511122241086587, 0.7550794567062818, 0.7575563667232598, 0.760023089983022, 0.763937181663837, 0.7639468590831918, 0.7639629881154499, 0.7639694397283531, 0.7639694397283531, 0.7650054329371817, 0.7654560271646859, 0.7654560271646859, 0.7654560271646859, 0.7654560271646859, 0.7659592529711375});
        }};
        var m11 = new HashMap<String, Double[]>() {{
            put("CS-correlation", new Double[] {0.726064728358397, 0.7302636196192895, 0.7350712611980504, 0.7375878868424757, 0.741195949591671, 0.7462779763110885, 0.7508566972027688, 0.7523844637445353, 0.753942161114814, 0.7544456916349183, 0.7554527526751266, 0.7564598137153349, 0.7579108200757483, 0.7593022412362623, 0.7615815530371864, 0.7615815530371864, 0.7624701114326997, 0.7629151525972419, 0.7629164881074486, 0.7629184913727587, 0.7629225022137888, 0.7629293768090062, 0.7629355836491203, 0.7629417904892344, 0.7634423627920095});
        }};
        var m22 = new HashMap<String, Double[]>() {{
            put("MBHO-correlation", new Double[] {0.730314041950264, 0.7378396157690349, 0.7408505599208931, 0.743078310178562, 0.7431078943102014, 0.7431300145837372, 0.74314303716555, 0.7431566807317687, 0.7431566807317687, 0.7446823417742472, 0.7446871228914155, 0.7461886692279676, 0.7512124926585788, 0.7567023968112332, 0.7622853657167454, 0.7642088736951382, 0.7665903435819554, 0.7701460049468227, 0.7747424021884165, 0.7747433312821397, 0.7747450355121701, 0.7747450355121701, 0.7782277098960908, 0.778230106208136, 0.778230106208136});
        }};
        // Display the convergence curve chart and save it
        ConvergenceCurvePlot CC = new ConvergenceCurvePlot(m1, m2, m11, m22);
        CC.savePlot(Path.of("...svg"));
        CC.Show();
        // Display the box plot chart and save it
        BoxPlot BB = new BoxPlot(m1, m2, m11, m22);
        BB.savePlot(Path.of("...svg"));
        BB.Show();
    }
}
