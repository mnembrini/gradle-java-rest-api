/*
 * MIT License
 *
 * Copyright (c) 2016 - 2018 Silvio Wangler (silvio.wangler@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package ch.silviowangler.gradle.restapi.builder.spring

import ch.silviowangler.gradle.restapi.AnnotationTypes
import ch.silviowangler.gradle.restapi.builder.AbstractRootResourceBuilder
import com.squareup.javapoet.TypeSpec
import org.gradle.api.Project

class SpringRootResourceFactory extends AbstractRootResourceBuilder {

    Project project
    TypeSpec.Builder rootResourceBuilder

    SpringRootResourceFactory withProject(Project project) {
        this.project = project
        return this
    }

    @Override
    TypeSpec buildRootResource(File optionsFile) {

        withSpecification(optionsFile)

        rootResourceBuilder = interfaceBaseInstance()

        rootResourceBuilder.addAnnotation(createAnnotation(AnnotationTypes.SPRING_REQUEST_MAPPING.getClassName(), [value: getPath()]))

        generateResourceMethods()

        // generated annotation

        // options

        // collection get

        // entity get

        // put

        // post

        // entity delete

        // collection delete

        return rootResourceBuilder.build()
    }
}