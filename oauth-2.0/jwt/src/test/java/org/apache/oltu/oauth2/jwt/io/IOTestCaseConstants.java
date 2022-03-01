/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.oltu.oauth2.jwt.io;

interface IOTestCaseConstants {

//    public final String JWT = "eyJhbGciOiJSUzI1NiIsImtpZCI6ImJlMWRhMGIzNTY3YmQyNjVhMjUwOThmYmNjMmIwOWYyMTM0"
//                            + "NWIzYTIifQ"
//                            + "."
//                            + "eyJhdWQiOiI3ODg3MzIzNzIwNzguYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJpc3MiOiJh"
//                            + "Y2NvdW50cy5nb29nbGUuY29tIiwic3ViIjoiMTA2NDIyNDUzMDgyNDc5OTk4NDI5IiwiZXhwIjox"
//                            + "MzY2NzMwMjE3LCJpYXQiOjEzNjY3MjYzMTcsImlkIjoiMTA2NDIyNDUzMDgyNDc5OTk4NDI5Iiwi"
//                            + "dmVyaWZpZWRfZW1haWwiOiJ0cnVlIiwiZW1haWxfdmVyaWZpZWQiOiJ0cnVlIiwiY2lkIjoiNzg4"
//                            + "NzMyMzcyMDc4LmFwcHMuZ29vZ2xldXNlcmNvbnRlbnQuY29tIiwiYXpwIjoiNzg4NzMyMzcyMDc4"
//                            + "LmFwcHMuZ29vZ2xldXNlcmNvbnRlbnQuY29tIiwiZW1haWwiOiJhbnRvbmlvLnNhbnNvQGdtYWls"
//                            + "LmNvbSIsInRva2VuX2hhc2giOiJMMkk3N2dpQkxrMFJTczB6UTFTdkNBIiwiYXRfaGFzaCI6Ikwy"
//                            + "STc3Z2lCTGswUlNzMHpRMVN2Q0EifQ"
//                            + "."
//                            + "XWYi5Zj1YWAMGIml_ftoAwmvW1Y7oeybLCpzQrJVuWJpS8L8Vd2TL-RTIOEVG03VA7e0_-_frNuw"
//                            + "7MxUgVEgh8G-Nnbk_baJ6k_3w5c1SKFamFiHHDoKLFhrt1Y8JKSuGwE02V-px4Cn0dRAQAc1IN5C"
//                            + "U6wqCrYK0p-fv_fvy28";

    // Changed when we made nbf a Long
    public final String JWT = "eyJhbGciOiJSUzI1NiIsImtpZCI6ImJlMWRhMGIzNTY3YmQyNjVhMjUwOThmYmNjMmIwOWYyMTM0NWIzYTIifQ.eyJhdWQiOiI3ODg3MzIzNzIwNzguYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJpc3MiOiJhY2NvdW50cy5nb29nbGUuY29tIiwibmJmIjowLCJzdWIiOiIxMDY0MjI0NTMwODI0Nzk5OTg0MjkiLCJleHAiOjEzNjY3MzAyMTcsImlhdCI6MTM2NjcyNjMxNywiaWQiOiIxMDY0MjI0NTMwODI0Nzk5OTg0MjkiLCJ2ZXJpZmllZF9lbWFpbCI6InRydWUiLCJlbWFpbF92ZXJpZmllZCI6InRydWUiLCJjaWQiOiI3ODg3MzIzNzIwNzguYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJhenAiOiI3ODg3MzIzNzIwNzguYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJlbWFpbCI6ImFudG9uaW8uc2Fuc29AZ21haWwuY29tIiwidG9rZW5faGFzaCI6IkwySTc3Z2lCTGswUlNzMHpRMVN2Q0EiLCJhdF9oYXNoIjoiTDJJNzdnaUJMazBSU3MwelExU3ZDQSJ9.XWYi5Zj1YWAMGIml_ftoAwmvW1Y7oeybLCpzQrJVuWJpS8L8Vd2TL-RTIOEVG03VA7e0_-_frNuw7MxUgVEgh8G-Nnbk_baJ6k_3w5c1SKFamFiHHDoKLFhrt1Y8JKSuGwE02V-px4Cn0dRAQAc1IN5CU6wqCrYK0p-fv_fvy28";

//    public final String JWT_MULTIPLE_AUDIENCES = "eyJhbGciOiJSUzI1NiIsImtpZCI6ImJlMWRhMGIzNTY3YmQyNjVhMjUwO"
//                            + "ThmYmNjMmIwOWYyMTM0NWIzYTIifQ"
//                            + "."
//                            + "eyJhdWQiOlsiNzg4NzMyMzcyMDc4LmFwcHMuZ29vZ2xldXNlcmNvbnRlbnQuY29tIiwiZm9vIl0s"
//                            + "ImlzcyI6ImFjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMDY0MjI0NTMwODI0Nzk5OTg0Mjki"
//                            + "LCJleHAiOjEzNjY3MzAyMTcsImlhdCI6MTM2NjcyNjMxNywiaWQiOiIxMDY0MjI0NTMwODI0Nzk5"
//                            + "OTg0MjkiLCJ2ZXJpZmllZF9lbWFpbCI6InRydWUiLCJlbWFpbF92ZXJpZmllZCI6InRydWUiLCJj"
//                            + "aWQiOiI3ODg3MzIzNzIwNzguYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJhenAiOiI3ODg3"
//                            + "MzIzNzIwNzguYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJlbWFpbCI6ImFudG9uaW8uc2Fu"
//                            + "c29AZ21haWwuY29tIiwidG9rZW5faGFzaCI6IkwySTc3Z2lCTGswUlNzMHpRMVN2Q0EiLCJhdF9o"
//                            + "YXNoIjoiTDJJNzdnaUJMazBSU3MwelExU3ZDQSJ9"
//                            + "."
//                            + "XWYi5Zj1YWAMGIml_ftoAwmvW1Y7oeybLCpzQrJVuWJpS8L8Vd2TL-RTIOEVG03VA7e0_-_frNuw"
//                            + "7MxUgVEgh8G-Nnbk_baJ6k_3w5c1SKFamFiHHDoKLFhrt1Y8JKSuGwE02V-px4Cn0dRAQAc1IN5C"
//                            + "U6wqCrYK0p-fv_fvy28";

    // Changed when we made nbf a Long
    public final String JWT_MULTIPLE_AUDIENCES = "eyJhbGciOiJSUzI1NiIsImtpZCI6ImJlMWRhMGIzNTY3YmQyNjVhMjUwOThmYmNjMmIwOWYyMTM0NWIzYTIifQ.eyJhdWQiOlsiNzg4NzMyMzcyMDc4LmFwcHMuZ29vZ2xldXNlcmNvbnRlbnQuY29tIiwiZm9vIl0sImlzcyI6ImFjY291bnRzLmdvb2dsZS5jb20iLCJuYmYiOjAsInN1YiI6IjEwNjQyMjQ1MzA4MjQ3OTk5ODQyOSIsImV4cCI6MTM2NjczMDIxNywiaWF0IjoxMzY2NzI2MzE3LCJpZCI6IjEwNjQyMjQ1MzA4MjQ3OTk5ODQyOSIsInZlcmlmaWVkX2VtYWlsIjoidHJ1ZSIsImVtYWlsX3ZlcmlmaWVkIjoidHJ1ZSIsImNpZCI6Ijc4ODczMjM3MjA3OC5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImF6cCI6Ijc4ODczMjM3MjA3OC5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoiYW50b25pby5zYW5zb0BnbWFpbC5jb20iLCJ0b2tlbl9oYXNoIjoiTDJJNzdnaUJMazBSU3MwelExU3ZDQSIsImF0X2hhc2giOiJMMkk3N2dpQkxrMFJTczB6UTFTdkNBIn0.XWYi5Zj1YWAMGIml_ftoAwmvW1Y7oeybLCpzQrJVuWJpS8L8Vd2TL-RTIOEVG03VA7e0_-_frNuw7MxUgVEgh8G-Nnbk_baJ6k_3w5c1SKFamFiHHDoKLFhrt1Y8JKSuGwE02V-px4Cn0dRAQAc1IN5CU6wqCrYK0p-fv_fvy28";

}
