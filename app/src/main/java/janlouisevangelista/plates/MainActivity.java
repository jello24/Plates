package janlouisevangelista.plates;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * calculateValues
     * Called when calcButton is pressed
     */
    public void calculateValues(View view)
    {
        EditText weightValueText = (EditText)findViewById(R.id.plateWeight);

        TextView plateWeightValue = (TextView)findViewById(R.id.plateWeightVal);
        TextView plate45Value = (TextView)findViewById(R.id.plate45Val);
        TextView plate35Value = (TextView)findViewById(R.id.plate35Val);
        TextView plate25Value = (TextView)findViewById(R.id.plate25Val);
        TextView plate10Value = (TextView)findViewById(R.id.plate10Val);
        TextView plate5Value = (TextView)findViewById(R.id.plate5Val);
        TextView plate2Value = (TextView)findViewById(R.id.plate2Val);

        Double weightValue = Double.parseDouble(weightValueText.getText().toString());

        PlateCalculator plateValues = new PlateCalculator(weightValue);

        plateWeightValue.setText(plateValues.getPlateWeight().toString());
        plate45Value.setText(plateValues.get45().toString());
        plate35Value.setText(plateValues.get35().toString());
        plate25Value.setText(plateValues.get25().toString());
        plate10Value.setText(plateValues.get10().toString());
        plate5Value.setText(plateValues.get5().toString());
        plate2Value.setText(plateValues.get2().toString());
    }
}
