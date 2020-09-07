package com.backend.challenge.Interaction.utils;

import com.backend.challenge.Interaction.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDataUtils {


    public static FileDetails createTestData(){
        CompatibleAssembly compatibleAssembly1 = new CompatibleAssembly();
        compatibleAssembly1.setAssyPN("SA-12-AAA");
        CompatibleAssembly compatibleAssembly2 = new CompatibleAssembly();
        compatibleAssembly2.setAssyPN("SA-12-AAB");
        CompatibleAssembly compatibleAssembly3 = new CompatibleAssembly();
        compatibleAssembly3.setAssyPN("SA-12-AAC");
        List<CompatibleAssembly> compatibleAssemblyList = new ArrayList<>();
        compatibleAssemblyList.add(compatibleAssembly1);
        compatibleAssemblyList.add(compatibleAssembly2);
        compatibleAssemblyList.add(compatibleAssembly3);

        FunctionalTypeValues functionalTypeValues1 = new FunctionalTypeValues();
        functionalTypeValues1.setFunctionalType("Custom Application");
        List<FunctionalTypeValues> functionalTypeValuesList = new ArrayList<>();
        functionalTypeValuesList.add(functionalTypeValues1);

        Protocol protocolObj1 = new Protocol();
        protocolObj1.setProtocolId(1);
        protocolObj1.setNetworkProtocol("OTA");
        protocolObj1.setNetworkWireless("yes");
        Protocol protocolObj2 = new Protocol();
        protocolObj1.setProtocolId(2);
        protocolObj1.setNetworkProtocol("USB");
        protocolObj1.setNetworkWireless("No");


        List<Protocol> protocolList = new ArrayList<>();
        protocolList.add(protocolObj1);
        protocolList.add(protocolObj2);

        MGMFile mgmFileObj = new MGMFile();
        mgmFileObj.setProtocolList(protocolList);
        mgmFileObj.setFileFormat("TAR.GZ");
        mgmFileObj.setChecksum("0xC7C1DA2F");
        mgmFileObj.setFileFingerprint("0x61192B821A9EA47D72DD360175C7A8EE");
        mgmFileObj.setROMSizeKB("1664508640");
        mgmFileObj.setSize("1664508640");
        mgmFileObj.setFileDateModified("Feb-18-2016 21:19:40");

        ApplicationPartDetail applicationPartDetail = new ApplicationPartDetail();
        applicationPartDetail.setFileName("SA-11-TT");
        applicationPartDetail.setFrozenStatus("True");
        applicationPartDetail.setSuccessorPartNumber("SA-11-TS");
        applicationPartDetail.setMgmFile(mgmFileObj);
        applicationPartDetail.setVersion("1.0");
        applicationPartDetail.setRunTimeSize("1664508640");

        List<String> testValues = Arrays.asList(new String []{"CS, DA, DE, FR-FR, PL, PT-PT, RU, SV,TR"});
        FileDetails fileDetails = new FileDetails();
        fileDetails.setType("Application1");
        //fileDetails.setValues(testValues);
        fileDetails.setApplicationPartDetail(applicationPartDetail);
        fileDetails.setApplicationDescription("Test Application to run certain features in the vehicle");
        fileDetails.setServiceable("Y");
        fileDetails.setTestable("Y");
        fileDetails.setCompatibleAssemblies(compatibleAssemblyList);
        fileDetails.setFunctionalTypeValues(functionalTypeValuesList);
        fileDetails.setSellable("N");
        fileDetails.setResidentOnVehicle("Y");
        fileDetails.setDigitallySigned("Generically Signed");
        fileDetails.setConsumerViewable("Y");
        fileDetails.setConsumerDownloadable("Y");
        fileDetails.setDealerDownloadable("Y");
        fileDetails.setOTAViewable("Y");
        fileDetails.setOTADownloadable("Y");

    return fileDetails;
    }

}
