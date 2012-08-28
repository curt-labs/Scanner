package com.curt.scanner;

import com.polk.decoder.VinDecoderException;
import com.polk.decoder.VinDecoderServiceStub;
import com.polk.decoder.VinDecoderServiceStub.DecodeVin;
import com.polk.decoder.VinDecoderServiceStub.DecodeVinE;
import com.polk.decoder.VinDecoderServiceStub.DecodeVinResponse;
import com.polk.decoder.VinDecoderServiceStub.DecodeVinResponseE;
import com.polk.decoder.VinDecoderServiceStub.VinRequest;

public class VinDecoder {

	
	public void getVehicle(String code){
		
		VinRequest req = new VinRequest();
		req.setVin(code);
		
		DecodeVin decode = new DecodeVin();
		decode.addVinRequest(req);
		
		DecodeVinE decodeE = new DecodeVinE();
		decodeE.setDecodeVin(decode);
		
		VinDecoderServiceStub stub = new VinDecoderServiceStub();
		try {
			DecodeVinResponseE respE = stub.decodeVin(decodeE);
			DecodeVinResponse resp = respE.getDecodeVinResponse();
			
			resp.
		} catch (VinDecoderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
