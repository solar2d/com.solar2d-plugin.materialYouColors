package plugin.materialYouColors;


import android.graphics.Color;

import android.util.Log;

import androidx.core.content.ContextCompat;

import com.ansca.corona.CoronaActivity;
import com.ansca.corona.CoronaEnvironment;
import com.ansca.corona.CoronaLua;
import com.ansca.corona.CoronaRuntime;
import com.ansca.corona.CoronaRuntimeListener;
import com.ansca.corona.CoronaRuntimeTask;
import com.ansca.corona.CoronaRuntimeTaskDispatcher;
import com.naef.jnlua.JavaFunction;
import com.naef.jnlua.LuaState;
import com.naef.jnlua.NamedJavaFunction;
import java.util.ArrayList;
import java.util.List;

import com.ansca.corona.purchasing.StoreServices;


@SuppressWarnings({"WeakerAccess", "unused"})
public class LuaLoader implements JavaFunction {



	@SuppressWarnings("unused")
	public LuaLoader() {
		CoronaActivity activity = CoronaEnvironment.getCoronaActivity();
		// Validate.
		if (activity == null) {
			throw new IllegalArgumentException("Activity cannot be null.");
		}
	}


	@Override
	public int invoke(LuaState L) {
		// Register this plugin into Lua with the following functions.
		NamedJavaFunction[] luaFunctions = new NamedJavaFunction[] {
			new getColors(),

		};
		String libName = L.toString( 1 );
		L.register(libName, luaFunctions);



		return 1;
	}


	private class getColors implements NamedJavaFunction {

		@Override
		public String getName() {
			return "getColors";
		}
		@Override
		public int invoke(LuaState L) {
			if (android.os.Build.VERSION.SDK_INT >= 31) {
				L.newTable(5,0);
				int luaTableStackIndex = L.getTop();
				int[][] myUiStyles = {
						{ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent1_0), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent1_10), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent1_50), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent1_100), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent1_200), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent1_300), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent1_400), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent1_500), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent1_600), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent1_700), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent1_800), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent1_900), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent1_1000) },
						{ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent2_0), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent2_10), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent2_50), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent2_100), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent2_200), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent2_300), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent2_400), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent2_500), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent2_600), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent2_700), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent2_800), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent2_900), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent2_1000) },
						{ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent3_0), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent3_10), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent3_50), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent3_100), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent3_200), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent3_300), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent3_400), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent3_500), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent3_600), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent3_700), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent3_800), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent3_900), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_accent3_1000) },
						{ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral1_0), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral1_10), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral1_50), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral1_100), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral1_200), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral1_300), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral1_400), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral1_500), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral1_600), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral1_700), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral1_800), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral1_900), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral1_1000) },
						{ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral2_0), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral2_10), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral2_50), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral2_100), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral2_200), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral2_300), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral2_400), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral2_500), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral2_600), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral2_700), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral2_800), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral2_900), ContextCompat.getColor(CoronaEnvironment.getApplicationContext(), android.R.color.system_neutral2_1000) },
				};
				for (int i = 0; i < myUiStyles.length; ++i) {
					L.newTable(myUiStyles[i].length, 0);
					int luaTableStackIndex2 = L.getTop();
					for(int j = 0; j < myUiStyles[i].length; ++j) {
						L.newTable(3,0);
						int luaTableStackIndex3 = L.getTop();
						int color = myUiStyles[i][j];
						L.pushNumber((double) Color.red(color)/255);
						L.rawSet(luaTableStackIndex3,   1);
						L.pushNumber((double) Color.green(color)/255);
						L.rawSet(luaTableStackIndex3,   2);
						L.pushNumber((double) Color.blue(color)/255);
						L.rawSet(luaTableStackIndex3,   3);
						L.rawSet(luaTableStackIndex2,   j+1);
					}
					L.rawSet(luaTableStackIndex,   i+1);
				}
				return 1;
			}
			return 0;
		}
	}


}
