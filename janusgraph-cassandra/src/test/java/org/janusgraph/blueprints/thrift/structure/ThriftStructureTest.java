// Copyright 2017 JanusGraph Authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.janusgraph.blueprints.thrift.structure;

import org.janusgraph.CassandraStorageSetup;
import org.janusgraph.blueprints.thrift.ThriftGraphProvider;
import org.janusgraph.core.JanusGraph;
import org.apache.tinkerpop.gremlin.GraphProviderClass;
import org.apache.tinkerpop.gremlin.structure.StructureStandardSuite;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * @author Matthias Broecheler (me@matthiasb.com)
 */
@RunWith(StructureStandardSuite.class)
@GraphProviderClass(provider = ThriftGraphProvider.class, graph = JanusGraph.class)
public class ThriftStructureTest {

//    TP3 ignores @BeforeClass -- the following method is never executed
//    @BeforeClass
//    public static void beforeSuite() {
//        CassandraStorageSetup.startCleanEmbedded();
//    }

}
