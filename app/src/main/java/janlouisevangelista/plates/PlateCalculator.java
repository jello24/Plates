package janlouisevangelista.plates;

/**
 * Created by Jello on 2017-11-18.
 */

/**
 * The PlateCalculator class takes a total weight (bar + plates) and calculates
 * what plates per side to use for the given weight.
 * For example, an input of 175 lbs should return 1 45lb and 2 10lb plates.
 * 2*[ (2*10) + (1*45) ] + 45 lb = 175 lbs
 */
public class PlateCalculator {

    // Fields
    private Double plate45 = 0.;  // number of 45 lb plates
    private Double plate35 = 0.;  // number of 35 lb plates
    private Double plate25 = 0.;  // number of 25 lb plates
    private Double plate10 = 0.;  // number of 10 lb plates
    private Double plate5 = 0.;   // number of 5 lb plates
    private Double plate2 = 0.;   // number of 2.5 lb plates
    private Double plateWeight;
    private Double plateWeightInit = 0.;
    private Double barWeight = 45.0;

    // Constructor
    public PlateCalculator(Double weight)
    {
        if(weight >= barWeight)
            plateWeightInit = (weight - barWeight) / 2.;
        else
            plateWeightInit = 0.;
        calculate(weight);
    }

    // Methods
    public void calculate(Double weight)
    {
        // Check if weight is smaller than bar weight
        if(weight < barWeight)
            return;

        // Calculate plate weight
        plateWeight = (weight - barWeight) / 2.;

        // Calculate number of 45 lb plates
        if(plateWeight >= 45.0)
            plate45 = Math.floor(plateWeight / 45.0);

        // Calculate number of 35 lb plates
        plateWeight = plateWeight - (plate45 * 45.0);
        if(plateWeight >= 35.0)
            plate35 = Math.floor(plateWeight / 35.0);

        // Calculate number of 25 lb plates
        plateWeight = plateWeight - (plate35 * 35.0);
        if(plateWeight >= 25.0)
            plate25 = Math.floor(plateWeight / 25.0);

        // Calculate number of 10 lb plates
        plateWeight = plateWeight - (plate25 * 25.0);
        if(plateWeight >= 10.0)
            plate10 = Math.floor(plateWeight / 10.0);

        // Calculate number of 5 lb plates
        plateWeight = plateWeight - (plate10 * 10.0);
        if(plateWeight >= 5.0)
            plate5 = Math.floor(plateWeight / 5.0);

        // Calculate number of 2.5 lb plates
        plateWeight = plateWeight - (plate5 * 5.0);
        if(plateWeight >= 2.5)
            plate2 = Math.floor(plateWeight / 2.5);
    }

    // Getter methods
    public Double getPlateWeight()
    {
        return plateWeightInit;
    }

    public Integer get45()
    {
        return plate45.intValue();
    }

    public Integer get35()
    {
        return plate35.intValue();
    }

    public Integer get25()
    {
        return plate25.intValue();
    }

    public Integer get10()
    {
        return plate10.intValue();
    }

    public Integer get5()
    {
        return plate5.intValue();
    }

    public Integer get2()
    {
        return plate2.intValue();
    }
}
