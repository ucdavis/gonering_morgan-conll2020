package extraction;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StepOne {
	public String udDirectory = new String();
	public boolean isWindows;
	public String lang = new String();
	public String langAbv = new String();
	
	public StepOne(String dataDir, boolean isWin) {
		this.udDirectory = dataDir;
		this.isWindows = isWin;
	}
	
	public void extractAndWrite(String lg, String abrv) {
		this.lang = lg;
		this.langAbv = abrv;
		ArrayList<ArrayList<String>> sentence = new ArrayList<>();
		ArrayList<ArrayList<String>> lines = new ArrayList<>();
		FileWriter fWTemp;
		String langPath = udDirectory.concat(lang).concat("/treebanks");
		String s1Path = udDirectory.concat(lang).concat("/ud-").concat(langAbv).concat("-temp.csv");
				
		if(isWindows) {
			langPath = langPath.replace("/", "\\");
			s1Path = s1Path.replace("/", "\\");
		}
		
		try {
			fWTemp = new FileWriter(s1Path);
			fWTemp.append("subject,verb,object,order\n");
						
			Files.walk(Paths.get(langPath)).filter(Files::isRegularFile).forEach(f -> {
				System.out.println(f);
				Scanner fileScanner = null;
				try {
					fileScanner = new Scanner(new FileInputStream(f.toString()));
					while(fileScanner.hasNextLine()) {
						String line = fileScanner.nextLine();
						
						if(!line.startsWith("#") && !line.isEmpty() && !Character.isWhitespace(line.charAt(0))) {
							String[] temp = line.split("\t");
							ArrayList<String> tempList = new ArrayList<>();
							for(int i = 0; i < temp.length; i++) {
								tempList.add(temp[i]);
							}
							lines.add(tempList);
						}
						else {
							for(int i = 0; i < lines.size(); i++) {
								ArrayList<ArrayList<String>> tempList = new ArrayList<>();
								while(i < lines.size() && lines.get(i).get(0).contains("-")) {
									i++;
								}
								if(Double.parseDouble(lines.get(i).get(0)) == 1) {
									tempList.add(lines.get(i));
									i++;
									if(i < lines.size() && lines.get(i).get(0).contains("-")) {
										i++;
										
									}
									while(i < lines.size() && Double.parseDouble(lines.get(i).get(0)) != 1) {
										tempList.add(lines.get(i));
										i++;
										if(i < lines.size() && lines.get(i).get(0).contains("-")) {
											i++;
										}
									}
									sentence.addAll(tempList);
									i--;
								}
							}
							
							if(sentence.size() > 0) {
								ArrayList<ArrayList<String>> subject = new ArrayList<>();
								ArrayList<ArrayList<String>> object = new ArrayList<>();
								ArrayList<ArrayList<String>> verb = new ArrayList<>();
								// loop thru words in the sentence to find transitive
								boolean transitive = false, subj = false, vrb = false, obj = false;
								for(int i = 0; i < sentence.size(); i++) {
									if(sentence.get(i).get(7).contains("subj")) {
										subj = true;
										subject.add(sentence.get(i));
									}
									if(sentence.get(i).get(7).contains("obj")) {
										obj = true;
										object.add(sentence.get(i));
									}
									if(sentence.get(i).get(7).contains("root") || sentence.get(i).get(7).contains("aux") ||
											sentence.get(i).get(7).contains("cop") || sentence.get(i).get(7).contains("ccomp") ||
											sentence.get(i).get(7).contains("acl") || sentence.get(i).get(7).contains("advcl") ||
											sentence.get(i).get(7).contains("parataxis") || sentence.get(i).get(7).contains("xcomp")) {
										vrb = true;
										verb.add(sentence.get(i));
									}
									if(subj && vrb && obj) {
										for(int k = 0; k < subject.size(); k++) {
											for(int m = 0; m < verb.size(); m++) {
												if(Integer.parseInt(subject.get(k).get(6)) == Integer.parseInt(verb.get(m).get(0)) && !transitive) {
													for(int n = 0; n < object.size(); n++) {
														if(Integer.parseInt(object.get(n).get(6)) == Integer.parseInt(verb.get(m).get(0))) {
															transitive = true;
															String s = subject.get(k).get(2);
															if(s.startsWith("_")) {
																s = subject.get(k).get(1);
															}
															int subjIndex = Integer.parseInt(subject.get(k).get(0));
															
															String o = object.get(n).get(2);
															if(o.startsWith("_")) {
																o = object.get(n).get(1);
															}
															int objIndex = Integer.parseInt(object.get(n).get(0));
															
															int verbIndex = Integer.parseInt(verb.get(m).get(0));
															// look for compound subjects and objects
															for(int a = 0; a < sentence.size(); a++) {
																if(sentence.get(i).get(6).contains("_")) {
																	a++;
																}
																if(a < sentence.size() && !sentence.get(a).get(6).contains("_") && Integer.parseInt(sentence.get(a).get(6)) == Integer.parseInt(subject.get(k).get(0))) {
																	if(sentence.get(a).get(7).contains("flat")) {
																		s = s.concat("_").concat(sentence.get(a).get(2));
																	}
																	else {
																		if(sentence.get(a).get(7).contains("compound")) {
																			s = sentence.get(a).get(2).concat("_").concat(s);
																		}
																	}
																}
															}
															for(int a = 0; a < sentence.size(); a++) {
																if(sentence.get(a).get(6).contains("_")) {
																	a++;
																}
																if(a < sentence.size() && !sentence.get(a).get(6).contains("_") &&  Integer.parseInt(sentence.get(a).get(6)) == Integer.parseInt(object.get(n).get(0))) {
																	if(sentence.get(a).get(7).contains("flat")) {
																		if(sentence.get(a).get(2).startsWith("_")) {
																			o = o.concat("_").concat(sentence.get(a).get(1));
																		}
																		else {
																			o = o.concat("_").concat(sentence.get(a).get(2));
																		}
																	}
																	else {
																		if(sentence.get(a).get(7).contains("compound")) {
																			if(sentence.get(a).get(2).startsWith("_")) {
																				o = sentence.get(a).get(1).concat("_").concat(o);
																			}
																			else {
																				o = sentence.get(a).get(2).concat("_").concat(o);
																			}
																		}
																	}
																}
															}
															String v = verb.get(m).get(2);
															if(v.startsWith("_")) {
																v = verb.get(m).get(1);
															}
															
															if(s.contains(",")) {
																s = s.replaceAll(",", "_");
															}
															if(v.contains(",")) {
																v = v.replaceAll(",", "_");
															}
															if(o.contains(",")) {
																o = o.replaceAll(",", "_");
															}
															
															if(s.contains("'") || s.contains("\"")) {
																s = s.replaceAll("'", "");
																s = s.replaceAll("\"", "");
															}
															if(v.contains("'") || v.contains("\"")) {
																v = v.replaceAll("'", "");
																v = v.replaceAll("\"", "");
															}
															if(o.contains("'") || o.contains("\"")) {
																o = o.replaceAll("'", "");
																o = o.replaceAll("\"", "");
															}
															
															fWTemp.append(s.concat(",").concat(v).concat(",").concat(o));
															
															// find word order
															String order = "";
															if(subjIndex < verbIndex) {
									            				// subj before verb: svo, sov, osv
									            				if(subjIndex < objIndex) {
									            					// subj before obj: svo, sov
									            					if(verbIndex < objIndex) {
									            						// verb before obj: svo
									            						order = "SVO";
									            					}
									            					else {
									            						// verb after obj: sov
									            						order = "SOV";
									            					}
									            				}
									            				else {
									            					// obj before subj: osv
									            					order = "OSV";
									            				}
									            			}
									            			else {
									            				// verb before subj: vso, vos, ovs
									            				if(objIndex < subjIndex) {
									            					// obj before subj: vos, ovs
									            					if(verbIndex < objIndex) {
									            						// verb before obj: vos
									            						order = "VOS";
									            					}
									            					else {
									            						// obj before verb: ovs
									            						order = "OVS";
									            					}
									            				}
									            				else {
									            					// subj before obj: vso
									            					order = "VSO";
									            				}
									            			}
															fWTemp.append("," + order + "\n");
															fWTemp.flush();
															break;
														}
													}
												}
											}
										}
										if(transitive) {
											break;
										}
									}
								}
								sentence.clear();
								lines.clear();
							}
						}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(fileScanner != null) fileScanner.close();
				
			});
			fWTemp.flush();
			fWTemp.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
