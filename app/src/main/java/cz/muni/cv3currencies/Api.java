package cz.muni.cv3currencies;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {
	private static final String URL = "http://api.fixer.io//";

	public static ServerService serverService;

	public static ServerService get() {
		if (serverService == null) {
			HttpLoggingInterceptor logger = new HttpLoggingInterceptor();
			logger.setLevel(HttpLoggingInterceptor.Level.BODY);

			OkHttpClient client = new OkHttpClient.Builder()
					.addInterceptor(logger)
					.build();

			Retrofit retrofit = new Retrofit.Builder()
					.baseUrl(URL)
					.client(client)
					.addConverterFactory(GsonConverterFactory.create())
					.build();

			serverService = retrofit.create(ServerService.class);
		}

		return serverService;
	}

	public interface ServerService {

	}
}
