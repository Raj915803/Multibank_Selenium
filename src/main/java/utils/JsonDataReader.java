package utils;

import java.io.File;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import constants.FrameworkConstants;

public class JsonDataReader {

	public static Map<String, Object> getTestData() {

		Map<String, Object> data = null;

		try {

			ObjectMapper mapper = new ObjectMapper();

			data = mapper.readValue(new File(FrameworkConstants.TESTDATA_PATH), Map.class);

		} catch (Exception e) {

			e.printStackTrace();

		}

		return data;

	}

}
